La clase "Diccionario" es una clase que representa un diccionario de palabras. Tiene varios métodos para manipular y consultar las palabras almacenadas en el diccionario. A continuación, se explica cada uno de los métodos en español:

* **Método "añadirPalabra":** Este método permite añadir una palabra al diccionario. Toma como parámetro una palabra y la agrega al diccionario, asegurándose de organizarla según su inicial. Si la inicial ya existe en el diccionario, la palabra se agrega al conjunto de palabras correspondiente a esa inicial. Si la inicial no existe, se crea un nuevo conjunto de palabras para esa inicial y se agrega la palabra al conjunto.


* **Método "eliminarPalabra":** Este método permite eliminar una palabra del diccionario. Toma como parámetro la palabra que se desea eliminar. Recorre todos los conjuntos de palabras en el diccionario y busca si la palabra existe en alguno de ellos. Si encuentra la palabra, la elimina del conjunto y finaliza la búsqueda. Si la palabra es eliminada, se muestra un mensaje indicando que se ha eliminado correctamente. Si la palabra no existe en el diccionario, se muestra un mensaje indicando que la palabra no existe.


* **Método "existePalabra":** Este método verifica si una palabra existe en el diccionario. Toma como parámetro la palabra a comparar. Recorre todos los conjuntos de palabras en el diccionario y busca si la palabra existe en alguno de ellos. Si encuentra la palabra, se establece una bandera indicando que la palabra existe y se finaliza la búsqueda. Si la palabra existe, se muestra un mensaje indicando que la palabra existe. Si la palabra no existe en el diccionario, se muestra un mensaje indicando que la palabra no existe.


* **Método "mostrarIniciales":** Este método muestra por pantalla todas las iniciales de las palabras presentes en el diccionario. Utiliza el método "keySet()" del diccionario para obtener el conjunto de iniciales y lo muestra en la salida estándar.


* **Método "mostrarPalabras":** Este método muestra por pantalla todas las palabras que comienzan con una inicial específica. Toma como parámetro la inicial y utiliza el método "get()" del diccionario para obtener el conjunto de palabras correspondiente a esa inicial y lo muestra en la salida estándar.


