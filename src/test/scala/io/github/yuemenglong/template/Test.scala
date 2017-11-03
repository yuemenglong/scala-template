package io.github.yuemenglong.template

import java.io.FileOutputStream

import io.github.yuemenglong.template.HTML._

import scala.io.Source

/**
  * Created by <yuemenglong@126.com> on 2017/11/2.
  */

case class Obj(id: String, name: String) {
}

object Test {

  def main(args: Array[String]): Unit = {
    val objs = Array(Obj("1", "asdf"), Obj("2", "zxcv"))
    val is = Thread.currentThread().getContextClassLoader.getResourceAsStream("js/index.jsx")
    val jsx = Source.fromInputStream(is).getLines().mkString("\n")
    val html = <.html.>(
      <.head.>(
        <.script(src = "https://cdn.bootcss.com/jquery/3.2.1/jquery.js").>,
        <.script(src = "https://unpkg.com/react/umd/react.development.js").>,
        <.script(src = "https://unpkg.com/react-dom/umd/react-dom.development.js").>,
        <.script(src="https://cdn.bootcss.com/babel-standalone/6.25.0/babel.min.js").>,
        <.link(ty = "text/css", rel = "stylesheet", href = "https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css")
      ),
      <.body.>(
        <.table(className = "table").>(
          <.tr.>(
            Array("编号", "名称", "操作").map(s => <.th.>(s))
          ),
          objs.map(o => <.tr.>(
            <.td.>(o.id),
            <.td.>(o.name),
            <.td.>(<.a(data = o.id).>("更新"))
          ))
        ),
        <.div(id = "root").>,
        <.script(ty = "text/babel").>(jsx)
      ),
    )
    new FileOutputStream("scala.html").write(html.toString.getBytes())
  }
}
