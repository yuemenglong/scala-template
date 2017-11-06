package io.github.yuemenglong.template

class Element(tag: String,
              props: Map[String, String] = Map(),
              style: Map[String, String] = Map(),
              var children: Array[Renderable] = Array())
  extends Renderable {

  override def renderToHtml(): String = {
    val attrStr = props.filter(_._2 != null).map { case (name, value) => s"""$name='$value'""" }.mkString(" ")
    val styleStr = style.map { case (name, value) => s"""$name:$value""" }.mkString(":")
    val attrs = (attrStr, styleStr) match {
      case ("", "") => ""
      case ("", _) => s" style:'$styleStr'"
      case (_, "") => s" $attrStr"
      case (_, _) => s" $attrStr style:'$styleStr'"
    }
    val content = children.map(_.renderToHtml()).mkString("")
    s"""<$tag$attrs>$content</$tag>"""
  }

  override def >(cs: Renderable*): Renderable = {
    this.children = cs.toArray
    this
  }

  override def > /**/ : Renderable = this
}

//abstract case class Component() extends Renderable {
//  def render(): Renderable
//
//  override def renderToHtml(): String = render().renderToHtml()
//}


