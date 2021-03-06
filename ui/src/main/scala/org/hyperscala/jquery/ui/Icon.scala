package org.hyperscala.jquery.ui

import org.powerscala.enum.{Enumerated, EnumEntry}
import org.hyperscala.html._

/**
 * @author Matt Hicks <matt@outr.com>
 */
sealed abstract class Icon(val styleClass: String) extends EnumEntry {
  def create() = new tag.Span(clazz = List("ui-icon", styleClass))
}

object Icon extends Enumerated[Icon] {
  case object carat1n extends Icon("ui-icon-carat-1-n")
  case object carat1ne extends Icon("ui-icon-carat-1-ne")
  case object carat1e extends Icon("ui-icon-carat-1-e")

  case object carat1se extends Icon("ui-icon-carat-1-se")
  case object carat1s extends Icon("ui-icon-carat-1-s")
  case object carat1sw extends Icon("ui-icon-carat-1-sw")
  case object carat1w extends Icon("ui-icon-carat-1-w")
  case object carat1nw extends Icon("ui-icon-carat-1-nw")
  case object carat2ns extends Icon("ui-icon-carat-2-n-s")
  case object carat2ew extends Icon("ui-icon-carat-2-e-w")
  case object triangle1n extends Icon("ui-icon-triangle-1-n")
  case object triangle1ne extends Icon("ui-icon-triangle-1-ne")

  case object triangle1e extends Icon("ui-icon-triangle-1-e")
  case object triangle1se extends Icon("ui-icon-triangle-1-se")
  case object triangle1s extends Icon("ui-icon-triangle-1-s")
  case object triangle1sw extends Icon("ui-icon-triangle-1-sw")
  case object triangle1w extends Icon("ui-icon-triangle-1-w")
  case object triangle1nw extends Icon("ui-icon-triangle-1-nw")
  case object triangle2ns extends Icon("ui-icon-triangle-2-n-s")
  case object triangle2ew extends Icon("ui-icon-triangle-2-e-w")
  case object arrow1n extends Icon("ui-icon-arrow-1-n")

  case object arrow1ne extends Icon("ui-icon-arrow-1-ne")
  case object arrow1e extends Icon("ui-icon-arrow-1-e")
  case object arrow1se extends Icon("ui-icon-arrow-1-se")
  case object arrow1s extends Icon("ui-icon-arrow-1-s")
  case object arrow1sw extends Icon("ui-icon-arrow-1-sw")
  case object arrow1w extends Icon("ui-icon-arrow-1-w")
  case object arrow1nw extends Icon("ui-icon-arrow-1-nw")
  case object arrow2ns extends Icon("ui-icon-arrow-2-n-s")
  case object arrow2nesw extends Icon("ui-icon-arrow-2-ne-sw")

  case object arrow2ew extends Icon("ui-icon-arrow-2-e-w")
  case object arrow2senw extends Icon("ui-icon-arrow-2-se-nw")
  case object arrowstop1n extends Icon("ui-icon-arrowstop-1-n")
  case object arrowstop1e extends Icon("ui-icon-arrowstop-1-e")
  case object arrowstop1s extends Icon("ui-icon-arrowstop-1-s")
  case object arrowstop1w extends Icon("ui-icon-arrowstop-1-w")
  case object arrowthick1n extends Icon("ui-icon-arrowthick-1-n")
  case object arrowthick1ne extends Icon("ui-icon-arrowthick-1-ne")
  case object arrowthick1e extends Icon("ui-icon-arrowthick-1-e")

  case object arrowthick1se extends Icon("ui-icon-arrowthick-1-se")
  case object arrowthick1s extends Icon("ui-icon-arrowthick-1-s")
  case object arrowthick1sw extends Icon("ui-icon-arrowthick-1-sw")
  case object arrowthick1w extends Icon("ui-icon-arrowthick-1-w")
  case object arrowthick1nw extends Icon("ui-icon-arrowthick-1-nw")
  case object arrowthick2ns extends Icon("ui-icon-arrowthick-2-n-s")
  case object arrowthick2nesw extends Icon("ui-icon-arrowthick-2-ne-sw")
  case object arrowthick2ew extends Icon("ui-icon-arrowthick-2-e-w")
  case object arrowthick2senw extends Icon("ui-icon-arrowthick-2-se-nw")

  case object arrowthickstop1n extends Icon("ui-icon-arrowthickstop-1-n")
  case object arrowthickstop1e extends Icon("ui-icon-arrowthickstop-1-e")
  case object arrowthickstop1s extends Icon("ui-icon-arrowthickstop-1-s")
  case object arrowthickstop1w extends Icon("ui-icon-arrowthickstop-1-w")
  case object arrowreturnthick1w extends Icon("ui-icon-arrowreturnthick-1-w")
  case object arrowreturnthick1n extends Icon("ui-icon-arrowreturnthick-1-n")
  case object arrowreturnthick1e extends Icon("ui-icon-arrowreturnthick-1-e")
  case object arrowreturnthick1s extends Icon("ui-icon-arrowreturnthick-1-s")
  case object arrowreturn1w extends Icon("ui-icon-arrowreturn-1-w")

  case object arrowreturn1n extends Icon("ui-icon-arrowreturn-1-n")
  case object arrowreturn1e extends Icon("ui-icon-arrowreturn-1-e")
  case object arrowreturn1s extends Icon("ui-icon-arrowreturn-1-s")
  case object arrowrefresh1w extends Icon("ui-icon-arrowrefresh-1-w")
  case object arrowrefresh1n extends Icon("ui-icon-arrowrefresh-1-n")
  case object arrowrefresh1e extends Icon("ui-icon-arrowrefresh-1-e")
  case object arrowrefresh1s extends Icon("ui-icon-arrowrefresh-1-s")
  case object arrow4 extends Icon("ui-icon-arrow-4")
  case object arrow4diag extends Icon("ui-icon-arrow-4-diag")

  case object extlink extends Icon("ui-icon-extlink")
  case object newwin extends Icon("ui-icon-newwin")
  case object refresh extends Icon("ui-icon-refresh")
  case object shuffle extends Icon("ui-icon-shuffle")
  case object transferew extends Icon("ui-icon-transfer-e-w")
  case object transferthickew extends Icon("ui-icon-transferthick-e-w")
  case object foldercollapsed extends Icon("ui-icon-folder-collapsed")
  case object folderopen extends Icon("ui-icon-folder-open")
  case object document extends Icon("ui-icon-document")

  case object documentb extends Icon("ui-icon-document-b")
  case object note extends Icon("ui-icon-note")
  case object mailclosed extends Icon("ui-icon-mail-closed")
  case object mailopen extends Icon("ui-icon-mail-open")
  case object suitcase extends Icon("ui-icon-suitcase")
  case object comment extends Icon("ui-icon-comment")
  case object person extends Icon("ui-icon-person")
  case object print extends Icon("ui-icon-print")
  case object trash extends Icon("ui-icon-trash")

  case object locked extends Icon("ui-icon-locked")
  case object unlocked extends Icon("ui-icon-unlocked")
  case object bookmark extends Icon("ui-icon-bookmark")
  case object tag extends Icon("ui-icon-tag")
  case object home extends Icon("ui-icon-home")
  case object flag extends Icon("ui-icon-flag")
  case object calculator extends Icon("ui-icon-calculator")
  case object cart extends Icon("ui-icon-cart")
  case object pencil extends Icon("ui-icon-pencil")

  case object clock extends Icon("ui-icon-clock")
  case object disk extends Icon("ui-icon-disk")
  case object calendar extends Icon("ui-icon-calendar")
  case object zoomin extends Icon("ui-icon-zoomin")
  case object zoomout extends Icon("ui-icon-zoomout")
  case object search extends Icon("ui-icon-search")
  case object wrench extends Icon("ui-icon-wrench")
  case object gear extends Icon("ui-icon-gear")
  case object heart extends Icon("ui-icon-heart")

  case object star extends Icon("ui-icon-star")
  case object link extends Icon("ui-icon-link")
  case object cancel extends Icon("ui-icon-cancel")
  case object plus extends Icon("ui-icon-plus")
  case object plusthick extends Icon("ui-icon-plusthick")
  case object minus extends Icon("ui-icon-minus")
  case object minusthick extends Icon("ui-icon-minusthick")
  case object close extends Icon("ui-icon-close")
  case object closethick extends Icon("ui-icon-closethick")

  case object key extends Icon("ui-icon-key")
  case object lightbulb extends Icon("ui-icon-lightbulb")
  case object scissors extends Icon("ui-icon-scissors")
  case object clipboard extends Icon("ui-icon-clipboard")
  case object copy extends Icon("ui-icon-copy")
  case object contact extends Icon("ui-icon-contact")
  case object image extends Icon("ui-icon-image")
  case object video extends Icon("ui-icon-video")
  case object script extends Icon("ui-icon-script")
  case object alert extends Icon("ui-icon-alert")

  case object info extends Icon("ui-icon-info")
  case object notice extends Icon("ui-icon-notice")
  case object help extends Icon("ui-icon-help")
  case object check extends Icon("ui-icon-check")
  case object bullet extends Icon("ui-icon-bullet")
  case object radiooff extends Icon("ui-icon-radio-off")
  case object radioon extends Icon("ui-icon-radio-on")
  case object pinw extends Icon("ui-icon-pin-w")
  case object pins extends Icon("ui-icon-pin-s")
  case object play extends Icon("ui-icon-play")
  case object pause extends Icon("ui-icon-pause")

  case object seeknext extends Icon("ui-icon-seek-next")
  case object seekprev extends Icon("ui-icon-seek-prev")
  case object seekend extends Icon("ui-icon-seek-end")
  case object seekfirst extends Icon("ui-icon-seek-first")
  case object stop extends Icon("ui-icon-stop")
  case object eject extends Icon("ui-icon-eject")
  case object volumeoff extends Icon("ui-icon-volume-off")
  case object volumeon extends Icon("ui-icon-volume-on")
  case object power extends Icon("ui-icon-power")

  case object signaldiag extends Icon("ui-icon-signal-diag")
  case object signal extends Icon("ui-icon-signal")
  case object battery0 extends Icon("ui-icon-battery-0")
  case object battery1 extends Icon("ui-icon-battery-1")
  case object battery2 extends Icon("ui-icon-battery-2")
  case object battery3 extends Icon("ui-icon-battery-3")
  case object circleplus extends Icon("ui-icon-circle-plus")
  case object circleminus extends Icon("ui-icon-circle-minus")
  case object circleclose extends Icon("ui-icon-circle-close")

  case object circletrianglee extends Icon("ui-icon-circle-triangle-e")
  case object circletriangles extends Icon("ui-icon-circle-triangle-s")
  case object circletrianglew extends Icon("ui-icon-circle-triangle-w")
  case object circletrianglen extends Icon("ui-icon-circle-triangle-n")
  case object circlearrowe extends Icon("ui-icon-circle-arrow-e")
  case object circlearrows extends Icon("ui-icon-circle-arrow-s")
  case object circlearroww extends Icon("ui-icon-circle-arrow-w")
  case object circlearrown extends Icon("ui-icon-circle-arrow-n")
  case object circlezoomin extends Icon("ui-icon-circle-zoomin")

  case object circlezoomout extends Icon("ui-icon-circle-zoomout")
  case object circlecheck extends Icon("ui-icon-circle-check")
  case object circlesmallplus extends Icon("ui-icon-circlesmall-plus")
  case object circlesmallminus extends Icon("ui-icon-circlesmall-minus")
  case object circlesmallclose extends Icon("ui-icon-circlesmall-close")
  case object squaresmallplus extends Icon("ui-icon-squaresmall-plus")
  case object squaresmallminus extends Icon("ui-icon-squaresmall-minus")
  case object squaresmallclose extends Icon("ui-icon-squaresmall-close")
  case object gripdottedvertical extends Icon("ui-icon-grip-dotted-vertical")

  case object gripdottedhorizontal extends Icon("ui-icon-grip-dotted-horizontal")
  case object gripsolidvertical extends Icon("ui-icon-grip-solid-vertical")
  case object gripsolidhorizontal extends Icon("ui-icon-grip-solid-horizontal")
  case object gripsmalldiagonalse extends Icon("ui-icon-gripsmall-diagonal-se")
  case object gripdiagonalse extends Icon("ui-icon-grip-diagonal-se")

  val values = findValues.toVector
}