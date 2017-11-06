package io.github.yuemenglong.template

/**
  * Created by <yuemenglong@126.com> on 2017/11/2.
  */

trait RenderablePart {
  def > /**/ : Renderable = this.asInstanceOf[Renderable]

  def >(cs: Renderable*): Renderable = this.asInstanceOf[Renderable]
}

trait Renderable extends RenderablePart {

  def renderToHtml(): String

  override def toString: String = renderToHtml()
}
