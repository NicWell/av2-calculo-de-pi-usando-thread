## Avaliação 2, Cálculo de pi usandos Threads
Esta atividade avaliativa tem como principal objetivo compreender melhor o conceito de thread e como elas podem ser usadas para utilizar melhor os recursos de processamento disponíveis nos computadores e sistemas operacionais modernos.



#### Execução com 1 Thread:

  | Execução | Tempo de Execução |
  |:---: |:---: |
  | 1 | 126.0 ms |
  | 2 | 116.0 ms |
  | 3 | 105.0 ms | 
  | 4 | 105.0 ms |
  | 5 | 109.0 ms | 

  ##### Valor de π = 3.1415936535887745
  ##### Tempo médio de execução = 112,2 ms
  ##### Desvio Padrão = 7,9694416366518 ms
<hr>

  #### Execução com 2 Threads:

  | Execução | Tempo de Execução |
  |:---: |:---: |
  | 1 | 73.0 ms |
  | 2 | 64.0 ms |
  | 3 | 66.0 ms | 
  | 4 | 67.0 ms |
  | 5 | 68.0 ms | 

  ##### Valor de π = 3.141597653584692
  ##### Tempo médio de execução = 67,6 ms
  ##### Desvio Padrão = 3,0066592756745 ms
  <hr>

  #### Execução com 4 Threads:

  | Execução | Tempo de Execução |
  |:---: |:---: |
  | 1 | 48.0 ms |
  | 2 | 57.0 ms |
  | 3 | 52.0 ms | 
  | 4 | 55.0 ms |
  | 5 | 63.0 ms | 

  ##### Valor de π = 3.14160832023367
  ##### Tempo médio de execução = 55 ms
  ##### Desvio Padrão = 5,0199601592044 ms
<hr>

#### Execução com 8 Threads:

  | Execução | Tempo de Execução |
  |:---: |:---: |
  | 1 | 68.0 ms |
  | 2 | 61.0 ms |
  | 3 | 66.0 ms | 
  | 4 | 74.0 ms |
  | 5 | 63.0 ms | 

  ##### Valor de π = 3.1416351392062585
  ##### Tempo médio de execução = 66,4 ms
  ##### Desvio Padrão = 4,4988887516807 ms
<hr>

#### Execução com 16 Threads:

  | Execução | Tempo de Execução |
  |:---: |:---: |
  | 1 | 75.0 ms |
  | 2 | 63.0 ms |
  | 3 | 64.0 ms | 
  | 4 | 76.0 ms |
  | 5 | 71.0 ms | 

  ##### Valor de π = 3.1416998365119575
  ##### Tempo médio de execução = 69,8 ms
  ##### Desvio Padrão = 5,4184868736576 ms
<hr>

#### Execução com 32 Threads:

  | Execução | Tempo de Execução |
  |:---: |:---: |
  | 1 | 81.0 ms |
  | 2 | 67.0 ms |
  | 3 | 79.0 ms | 
  | 4 | 76.0 ms |
  | 5 | 102.0 ms | 

  ##### Valor de π = 3.141851395629415
  ##### Tempo médio de execução = 96,2 ms
  ##### Desvio Padrão = 19,085072700935 ms
<hr>
<br>

### Calculos 

  #### Thread: 1
   ##### Tempo médio = (126+116+105+105+109)÷5 = 112,2 ms 
   ##### Desvio Padrão = √((126−112,2)²+(116−112,2)²+(105−112,2)²+(105−112,2)²+(109−112,2)²)÷5 = 7,9849859110708 ms
<br>

  #### Threads: 2
  ##### Tempo médio = (73+64+66+67+68)÷5 = 67,6 ms 
  ##### Desvio Padrão = √((73−67,6)²+(64−67,6)²+(66−67,6)²+(67−67,6)²+(68−67,6)²)÷5 = 3,0066592756745 ms
<br>

  #### Threads: 4
  ##### Tempo médio = (48+57+52+55+63)÷5 = 55 ms
  ##### Desvio Padrão = √((48−55)²+(57−55)²+(52−55)²+(55−55)²+(63−55)²)÷5 = 50199601592044 ms
<br>

  #### Threads: 8
  ##### Tempo médio = (68+61+66+74+63)÷5 = 66,4 ms 
  ##### Desvio Padrão = √((68−66,4)²+(61−66,4)²+(66−66,4)²+(74−66,4)²+(63−66,4)²)÷5 = 4,4988887516807 ms
<br>

  #### Threads: 16
  ##### Tempo médio = (75+63+64+76+71)÷5 = 69,8 ms 
  ##### Desvio Padrão = √((75−69,8)²+(63−69,8)²+(64−69,8)²+(76−69,8)²+(71−69,8)²)÷5 = 5,4184868736576 ms
<br>

  #### Threads: 32
  ##### Tempo médio = (81+67+79+76+102)÷5 = 96,2 ms 
  ##### Desvio Padrão = √((81−96,2)²+(67−96,2)²+(79−96,2)²+(76−96,2)²+(102−96,2)²)÷5 = 19,085072700935 ms