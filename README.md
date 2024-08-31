Ejercicio 2:

![Foto](Ejercicio2/Ejercicio2.png)

Se puede ver que si se hace de manera secuencial el tiempo que tarda en resolver es casi el doble y tiene mas
variabilidad en el tiempo de resultado a diferencia del paralelo que es más rápido y con menos variación.

# Correcciones - Estado: RE-ENTREGA

## Necesarias para aprobar:

- No se pueden ver las imágenes de las conclusiones del code coverage
- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Incluir qué Modo de Benchmark utilizaron, por qué lo eligieron, análizar qué representan los resultados, cómo influye
  la tasa de errores, etc.
