package io.github.yuemenglong.template.build

import java.io.FileOutputStream

/**
  * Created by <yuemenglong@126.com> on 2017/11/6.
  */
case class AttrDef(prop: String, attr: String = null) {
  def getAttr: String = {
    if (attr == null) {
      prop
    } else {
      attr
    }
  }
}

case class TagDef(tag: String, attrs: Array[AttrDef])

object Builder {

  def buildTag(tag: TagDef): String = {
    val attrsDef = tag.attrs.map(a => s"${a.prop}: S = null,").mkString("\n          ")
    val attrKv = tag.attrs.map(a =>s""""${a.getAttr}" -> ${a.prop},""").mkString("\n        ")
    s"""
       |  def ${tag.tag}(id: S = null,
       |          className: S = null,
       |          style: M = Map(),
       |          attrs: M = Map(),
       |          $attrsDef
       |         ): Renderable = {
       |    new Element("${tag.tag}",
       |      style = style,
       |      props = Map(
       |        "id" -> id,
       |        "class" -> className,
       |        $attrKv
       |      ) ++ attrs)
       |  }
       |  def ${tag.tag}: Renderable = new Element("${tag.tag}")""".stripMargin
  }

  def main(args: Array[String]): Unit = {
    val tags = Array(
      TagDef("div", Array(
      )),
      TagDef("span", Array(
      )),
      TagDef("html", Array(
      )),
      TagDef("head", Array(
      )),
      TagDef("body", Array(
      )),
      TagDef("meta", Array(
        AttrDef("content"),
        AttrDef("httpEquip", "http-equiv"),
        AttrDef("name"),
        AttrDef("scheme"),
      )),
      TagDef("script", Array(
        AttrDef("src"),
        AttrDef("ty", "type"),
      )),
      TagDef("link", Array(
        AttrDef("rel"),
        AttrDef("href"),
        AttrDef("ty", "type"),
      )),
      TagDef("a", Array(
        AttrDef("href"),
      )),
      TagDef("input", Array(
        AttrDef("ty", "type"),
        AttrDef("name"),
      )),
      TagDef("button", Array(
      )),
      TagDef("form", Array(
        AttrDef("action"),
        AttrDef("method"),
      )),
      TagDef("img", Array(
        AttrDef("src"),
      )),
      TagDef("table", Array(
      )),
      TagDef("thead", Array(
      )),
      TagDef("tbody", Array(
      )),
      TagDef("tr", Array(
      )),
      TagDef("th", Array(
      )),
      TagDef("td", Array(
      )),
    )
    val tagsDef = tags.map(buildTag).mkString("\n")
    val tpl =
      s"""
         |package io.github.yuemenglong.template
         |//noinspection ScalaFileName
         |object < {
         |  type S = String
         |  type M = Map[String, String]
         |  $tagsDef
         |}
      """.stripMargin
    println(tpl)
    val fs = new FileOutputStream("src\\main\\scala\\io\\github\\yuemenglong\\template\\HTML.scala")
    fs.write(tpl.getBytes())
    fs.close()
  }
}
