package io.github.yuemenglong.template

/**
  * Created by <yuemenglong@126.com> on 2017/11/2.
  */

object HTML {
  type M = Map[String, String]
  type S = String

  implicit def convertToRenderable[T](t: T): Renderable = { () => t.toString }

  implicit def arrayToRenderable(arr: Array[Renderable]): Renderable = { () => arr.map(_.renderToHtml()).mkString("") }

  object < {
    def div(id: S = null, className: S = null, style: M = Map()): Renderable = {
      new Element("div", style = style, props = Map(
        "id" -> id,
        "class" -> className
      ))
    }

    def div: Renderable = new Element("div")

    def span(id: S = null, className: S = null, style: M = Map()): Renderable = {
      new Element("span", style = style, props = Map(
        "id" -> id,
        "class" -> className
      ))
    }

    def span: Renderable = new Element("span")

    def html: Renderable = new Element("html")

    def head: Renderable = new Element("head")

    def body(style: M = Map()): Renderable = {
      new Element("body", style = style)
    }

    def body: Renderable = new Element("body")

    def a(id: S = null, className: S = null, style: M = Map(),
          href: S = null, onClick: S = null, data: S = null,
         ): Renderable = {
      new Element("a", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "href" -> href,
        "onclick" -> onClick,
        "data" -> data,
      ))
    }

    def a: Renderable = new Element("a")

    def input(id: S = null, className: S = null, style: M = Map(),
              ty: S = null, name: S = null, onChange: S = null,
             ): Renderable = {
      new Element("input", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "type" -> ty,
        "name" -> name,
        "onchange" -> onChange,
      ))
    }

    def input: Renderable = new Element("input")

    def button(id: S = null, className: S = null, style: M = Map(),
               onClick: S = null,
              ): Renderable = {
      new Element("button", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "onclick" -> onClick,
      ))
    }

    def button: Renderable = new Element("button")

    def form(id: S = null, className: S = null, style: M = Map(),
             action: S = null, method: S = null,
            ): Renderable = {
      new Element("form", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "action" -> action,
        "method" -> method,
      ))
    }

    def form: Renderable = new Element("form")

    def script(id: S = null, className: S = null, style: M = Map(),
               src: S = null
              ): Renderable = {
      new Element("script", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "src" -> src,
      ))
    }

    def script: Renderable = new Element("script")

    def link(id: S = null, className: S = null, style: M = Map(),
             rel: S = null, ty: S = null, href: S = null
            ): Renderable = {
      new Element("link", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "rel" -> rel,
        "type" -> ty,
        "href" -> href
      ))
    }

    def link: Renderable = new Element("link")

    def meta(id: S = null, className: S = null, style: M = Map(),
             content: S = null, httpEquiv: S = null, name: S = null, scheme: S = null,
            ): Renderable = {
      new Element("meta", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "content" -> content,
        "http-equiv" -> httpEquiv,
        "name" -> name,
        "scheme" -> scheme,
      ))
    }

    def meta: Renderable = new Element("meta")

    def img(id: S = null, className: S = null, style: M = Map(),
            src: S = null,
           ): Renderable = {
      new Element("img", style = style, props = Map(
        "id" -> id,
        "class" -> className,
        "src" -> src,
      ))
    }

    def img: Renderable = new Element("img")

    def table(id: S = null, className: S = null, style: M = Map(),
             ): Renderable = {
      new Element("table", style = style, props = Map(
        "id" -> id,
        "class" -> className,
      ))
    }

    def table: Renderable = new Element("table")

    def tr(id: S = null, className: S = null, style: M = Map(),
          ): Renderable = {
      new Element("tr", style = style, props = Map(
        "id" -> id,
        "class" -> className,
      ))
    }

    def tr: Renderable = new Element("tr")

    def td(id: S = null, className: S = null, style: M = Map(),
          ): Renderable = {
      new Element("td", style = style, props = Map(
        "id" -> id,
        "class" -> className,
      ))
    }

    def td: Renderable = new Element("td")

    def th(id: S = null, className: S = null, style: M = Map(),
          ): Renderable = {
      new Element("th", style = style, props = Map(
        "id" -> id,
        "class" -> className,
      ))
    }

    def th: Renderable = new Element("th")
  }

}
