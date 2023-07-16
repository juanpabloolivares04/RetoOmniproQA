Feature: Realizar una busqueda de producto con la barra de busqueda

 Scenario Outline: Busqueda de producto de menor valor

   Given que se requiere buscar el producto de menor valor ofrecido
   When se busque por la palabra |<producto>|
   Then me regrese el valor del menor producto y su detalle

   Examples:
  |producto|
  |Toyota Corola|
