algoritmo "Exercicio de Vetores"
// Para este algoritmo, eu fiz um sistema de soma AUTOMATICO que
// terminasse sempre em um resultado fixo para a variavel R: 12
var
v:vetor[10] de inteiro
m:vetor[2] de inteiro
r:vetor[2] de inteiro
I,soma:inteiro

inicio
escreval("-- SOMA DE VETORES PARA UM RESULTADO COMUM 12 --")
escreval("")
soma<- 1
para v[I] de 0 ate 9 faca
v[i]<-v[i]+soma
escreval("Vari�vel V:",v[I])
fimpara

escreval("------------------------------")

para m[I] de 0 ate 1 faca
m[I]<-m[I]+soma
escreval("Vari�vel M:",m[I])
fimpara

escreval("--------------------------------")

r[I]<-v[i]+m[i]
escreval("O resultado da soma dos vetores V e M �:",r[i])
fimalgoritmo
