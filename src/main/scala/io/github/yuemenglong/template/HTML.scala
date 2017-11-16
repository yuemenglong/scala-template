
package io.github.yuemenglong.template

object HTML {

  object < {
    type S = String
    type M = Map[String, String]

    def div(id: S = null,
            className: S = null,
            style: M = Map(),
            attrs: M = Map(),

           ): Renderable = {
      new Element("div",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def div: Renderable = new Element("div")

    def span(id: S = null,
             className: S = null,
             style: M = Map(),
             attrs: M = Map(),

            ): Renderable = {
      new Element("span",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def span: Renderable = new Element("span")

    def html(id: S = null,
             className: S = null,
             style: M = Map(),
             attrs: M = Map(),

            ): Renderable = {
      new Element("html",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def html: Renderable = new Element("html")

    def head(id: S = null,
             className: S = null,
             style: M = Map(),
             attrs: M = Map(),

            ): Renderable = {
      new Element("head",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def head: Renderable = new Element("head")

    def body(id: S = null,
             className: S = null,
             style: M = Map(),
             attrs: M = Map(),

            ): Renderable = {
      new Element("body",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def body: Renderable = new Element("body")

    def meta(id: S = null,
             className: S = null,
             style: M = Map(),
             attrs: M = Map(),
             content: S = null,
             httpEquip: S = null,
             name: S = null,
             scheme: S = null,
            ): Renderable = {
      new Element("meta",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,
          "content" -> content,
          "http-equiv" -> httpEquip,
          "name" -> name,
          "scheme" -> scheme,
        ) ++ attrs)
    }

    def meta: Renderable = new Element("meta")

    def script(id: S = null,
               className: S = null,
               style: M = Map(),
               attrs: M = Map(),
               src: S = null,
               ty: S = null,
              ): Renderable = {
      new Element("script",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,
          "src" -> src,
          "type" -> ty,
        ) ++ attrs)
    }

    def script: Renderable = new Element("script")

    def link(id: S = null,
             className: S = null,
             style: M = Map(),
             attrs: M = Map(),
             rel: S = null,
             href: S = null,
             ty: S = null,
            ): Renderable = {
      new Element("link",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,
          "rel" -> rel,
          "href" -> href,
          "type" -> ty,
        ) ++ attrs)
    }

    def link: Renderable = new Element("link")

    def a(id: S = null,
          className: S = null,
          style: M = Map(),
          attrs: M = Map(),
          href: S = null,
         ): Renderable = {
      new Element("a",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,
          "href" -> href,
        ) ++ attrs)
    }

    def a: Renderable = new Element("a")

    def input(id: S = null,
              className: S = null,
              style: M = Map(),
              attrs: M = Map(),
              ty: S = null,
              name: S = null,
              value: S = null,
             ): Renderable = {
      new Element("input",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,
          "type" -> ty,
          "name" -> name,
          "value" -> value,
        ) ++ attrs)
    }

    def input: Renderable = new Element("input")

    def button(id: S = null,
               className: S = null,
               style: M = Map(),
               attrs: M = Map(),

              ): Renderable = {
      new Element("button",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def button: Renderable = new Element("button")

    def form(id: S = null,
             className: S = null,
             style: M = Map(),
             attrs: M = Map(),
             action: S = null,
             method: S = null,
            ): Renderable = {
      new Element("form",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,
          "action" -> action,
          "method" -> method,
        ) ++ attrs)
    }

    def form: Renderable = new Element("form")

    def img(id: S = null,
            className: S = null,
            style: M = Map(),
            attrs: M = Map(),
            src: S = null,
           ): Renderable = {
      new Element("img",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,
          "src" -> src,
        ) ++ attrs)
    }

    def img: Renderable = new Element("img")

    def table(id: S = null,
              className: S = null,
              style: M = Map(),
              attrs: M = Map(),

             ): Renderable = {
      new Element("table",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def table: Renderable = new Element("table")

    def thead(id: S = null,
              className: S = null,
              style: M = Map(),
              attrs: M = Map(),

             ): Renderable = {
      new Element("thead",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def thead: Renderable = new Element("thead")

    def tbody(id: S = null,
              className: S = null,
              style: M = Map(),
              attrs: M = Map(),

             ): Renderable = {
      new Element("tbody",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def tbody: Renderable = new Element("tbody")

    def tr(id: S = null,
           className: S = null,
           style: M = Map(),
           attrs: M = Map(),

          ): Renderable = {
      new Element("tr",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def tr: Renderable = new Element("tr")

    def th(id: S = null,
           className: S = null,
           style: M = Map(),
           attrs: M = Map(),

          ): Renderable = {
      new Element("th",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def th: Renderable = new Element("th")

    def td(id: S = null,
           className: S = null,
           style: M = Map(),
           attrs: M = Map(),

          ): Renderable = {
      new Element("td",
        style = style,
        props = Map(
          "id" -> id,
          "class" -> className,

        ) ++ attrs)
    }

    def td: Renderable = new Element("td")
  }

}