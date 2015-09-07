<html>
<head>
  <title>Welcome!</title>
</head>
<body>

  	<!-- html注释 -->
  	<#-- freemarker注释 -->

  	<div>${author["name"]} -- <#if author.gender>男<#else>女</#if> -- ${author.birthday?date}</div>
  	<div>${author.name} -- ${author.gender?string("男", "女")} -- ${author.birthday?datetime}</div>
  	<div>${author.name} -- ${author.gender?then("男", "女")} -- ${author.birthday?datetime}</div>
  	
  	${author.name?starts_with("张")?string("是", "否")}
  	
  	<div>
  		<ul>
  			<#list author.books as book>
				<li>${book.title} -- #{book.price;m2} -- ${book.publishDate?date}</li><br/>
			</#list>
		</ul>
	</div>
	
	<div>
		 books: <#list author.books as book>${book.title}<#sep>, <#else>None</#list><br/> 
	</div>
</body>
</html>