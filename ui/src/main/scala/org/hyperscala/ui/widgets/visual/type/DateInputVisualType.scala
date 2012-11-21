package org.hyperscala.ui.widgets.visual.`type`

import org.hyperscala.ui.widgets.visual.VisualDetails
import java.text.SimpleDateFormat
import java.util.Date
import org.powerscala.property.StandardProperty

import org.hyperscala.html._
import org.hyperscala.javascript.JavaScriptString
import org.hyperscala.web.site.Webpage
import org.hyperscala.web.module.jQueryUI191

/**
 * @author Matt Hicks <matt@outr.com>
 */
class DateInputVisualType(format: String = "MM/dd/yyyy") extends InputVisualType[Long] {
  def valid(details: VisualDetails[_]) = details.clazz.getSimpleName.toLowerCase == "long"

  def fromString(s: String) = try {
    new SimpleDateFormat(format).parse(s).getTime
  } catch {
    case t: Throwable => 0L
  }

  def toString(t: Long) = t match {
    case 0L => ""
    case _ => new SimpleDateFormat(format).format(new Date(t))
  }

  override def create(property: StandardProperty[Long], details: VisualDetails[Long]) = {
    val input = super.create(property, details)
    input.identity
    Webpage().require(jQueryUI191)
    new tag.Div {
      contents += input
      contents += new tag.Script {
        contents += JavaScriptString("$('#%s').datepicker();".format(input.id()))
      }
    }
  }
}
