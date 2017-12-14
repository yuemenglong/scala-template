package io.github.yuemenglong.template

/**
  * Created by <yuemenglong@126.com> on 2017/11/6.
  */
object Converts {
  implicit def convertToRenderable[T](t: T): Renderable = { () =>
    t match {
      case null => ""
      case _ => t.toString
    }
  }

  implicit def arrayToRenderable(arr: Array[Renderable]): Renderable = { () => arr.map(_.renderToHtml()).mkString("") }
}
