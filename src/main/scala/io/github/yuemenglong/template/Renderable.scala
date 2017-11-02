package io.github.yuemenglong.template

/**
  * Created by <yuemenglong@126.com> on 2017/11/2.
  */
trait Renderable {

  def > /**/ : Renderable = this

  def >(cs: Renderable*): Renderable = this

  def renderToHtml(): String

  override def toString: String = renderToHtml()
}
