# scala-template
一个scala写的轻量级模板库，使用scala语法进行模板编写

可以写出如下的代码(这部分是一个scala方法的片段，可以嵌入任何action方法中)

    val html = <.html.>(
      <.head.>(
        <.script(src = "https://cdn.bootcss.com/jquery/3.2.1/jquery.js").>,
        <.script(src = "https://unpkg.com/react/umd/react.development.js").>,
        <.script(src = "https://unpkg.com/react-dom/umd/react-dom.development.js").>,
        <.script(src = "https://cdn.bootcss.com/babel-standalone/6.25.0/babel.min.js").>,
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
            <.td.>(<.a(attrs = Map("data" -> o.id)).>("更新"))
          ))
        ),
        <.div(id = "root").>,
        <.script(ty = "text/babel").>(jsx),
        <.div(id = "na").>,
      ),
