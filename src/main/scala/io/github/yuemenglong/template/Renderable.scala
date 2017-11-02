package io.github.yuemenglong.template

/**
  * Created by <yuemenglong@126.com> on 2017/11/2.
  */
trait Renderable {
  override def toString: String = renderToHtml()

  def renderToHtml(): String

  def > /**/ : Renderable = this

  def >(cs: Renderable*): Renderable = this
}

object Renderable {
  type P = Map[String, String]
  type S = String

  implicit def convertToRenderable[T](t: T): Renderable = { () => t.toString }

  object < {
    def div(id: S = null, className: S = null, style: P = Map()): Renderable = {
      new Element("div", style = style, props = Map(
        "id" -> id,
        "className" -> className
      ))
    }

    def div: Renderable = new Element("div")

    def span(id: S = null, className: S = null, style: P = Map()): Renderable = {
      new Element("span", style = style, props = Map(
        "id" -> id,
        "className" -> className
      ))
    }

    def span: Renderable = new Element("span")

    def html: Renderable = new Element("html")

    def head: Renderable = new Element("head")

    def body(style: P = Map()): Renderable = {
      new Element("body", style = style)
    }

    def body: Renderable = new Element("body")
  }

}