package org.hyperscala.examples

import org.hyperscala.web.Webpage
import com.outr.net.http.session.Session

/**
 * @author Matt Hicks <matt@outr.com>
 */
trait ExamplePage extends Webpage {
  def example: Example
}
