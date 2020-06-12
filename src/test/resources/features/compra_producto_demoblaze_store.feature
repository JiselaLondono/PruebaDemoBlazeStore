#language: es

  Característica: Realizar compra de producto en DemoBlaze Store
    Como usuario del sistema DemoBlaze Store
    Quiero realizar la compra de algún producto de tecnología en la página
    Para obtener beneficio del mismo

  Esquema del escenario: Realización de compra de producto en DemoBlaze Store
    Dado que me encuentro en la página de ventas de DemoBlaze Store
    Cuando procedo con la compra del producto <Producto> de la categoría <Categoria>
    Y diligencio los siguientes datos de compra
    |Nombre|Pais    |Ciudad  |Tajerta|Mes|Anio|
    |Jisela|Colombia|Medellín|1234   | 5 |2010|
    Entonces la compra se efectúa de manera exitosa

    Ejemplos:
    |Categoria|Producto   |
    |Laptops  |Dell i7 8gb|