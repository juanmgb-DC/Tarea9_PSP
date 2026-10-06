# *SOLO* Nivel 1

## Clase Descarga

- Creamos la clase Descarga heredando Thread y le damos atributos

![img.png](capturas/img.png)

- Creamos un constructor de Descarga que recibe el archivo como parametro

![img_1.png](capturas/img_1.png)

- Creamos el run (ya comentado)

![img_2.png](capturas/img_2.png)

- Para acabar con la clase Descarga hacemos un getter del Tiempo total

![img_3.png](capturas/img_3.png)

## Clase GestorDescargas

- Creamos la clase GestorDescargas y los hilos 

![img_4.png](capturas/img_4.png)


- Guardamos el tiempo actual y creamos un array de 4 espacios. Creamos 4 descargas con el nombre de cada hilo

![img_5.png](capturas/img_5.png)


- Arrancamos todas las descargas y bloqueamos el main hasta que terminen 

![img_6.png](capturas/img_6.png)


- Calculamos el tiempo total y creamos una variable para obtener la suma total de todos los tiempos 

![img_7.png](capturas/img_7.png)


- Printeamos la informacion que pide la tarea

![img_8.png](capturas/img_8.png)

## TABLA

![img_9.png](capturas/img_9.png)

1 -- 4639ms -- 4641ms -- 14995ms
![img_10.png](capturas/img_10.png)

2 -- 4578ms -- 4580ms -- 11284ms
![img_11.png](capturas/img_11.png)

3 -- 4827ms -- 4829ms -- 14129ms
![img_12.png](capturas/img_12.png)



## PREGUNTAS

**¿Por qué el tiempo real es mucho menor que la suma?**
Porque las cuatro descargas se ejecutan a la vez

**¿Qué pasa si hacéis start() y join() dentro del mismo bucle?**
Que el main arranca un hilo y espera a que termine antes de arrancar el
siguiente

## uso de IA
Busqué en Claude que comando podía utilizar para bloquear el programa hasta que terminen todas las descargas (join)