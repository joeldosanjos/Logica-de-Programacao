algoritmo "Quiz"

var
a:literal
b,c,d,f:inteiro

inicio
// Intro
escreval("--- Quiz: Criacionista ou Evolucionista? ---")
escreval("Digite SIM se quiser fazer o quiz ou N�O se n�o quiser.")
leia(a)
se(a="Sim")entao
senao
se(a="N�o")entao
escreval("Obrigado pela presen�a. Pressione ESC para sair.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela

// Primeira pergunta
escreval("Digite o n�mero da alternariva (1,2,3) para dar sua resposta.")
escreval("")
escreval("-------------- PRIMEIRA PERGUNTA --------------")
escreval("")
escreval("Voc� possui uma religi�o?")
escreval("1- Sim, possuo uma religi�o")
escreval("2- N�o, sou ateu/irreligioso")
escreval("3- Sou indeciso/agn�stico")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- SEGUNDA PERGUNTA --------------")
escreval("")
escreval("Em qual dessas teorias voc� acredita?")
escreval("1- Acredito na cria��o da Terra por um ser superior")
escreval("2- Acredito na teoria do Big Bang")
escreval("3- Nenhuma das anteriores")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="n�o")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- TERCEIRA PERGUNTA --------------")
escreval("")
escreval("Voc� concorda que n�s temos um parentesco com os primatas?")
escreval("1- N�o, n�o acredito")
escreval("2- Sim, acredito")
escreval("3- N�o sei dizer")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="nao")entao
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- QUARTA PERGUNTA --------------")
escreval("")
escreval("Voc� acredita que a evolu��o da vida na Terra foi formada em pouco tempo?")
escreval("1- Sim, com a devida velocidade do criador")
escreval("2- N�o, a formula��o da vida durou milh�es de anos")
escreval("3- N�o sei dizer")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="n�o")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- QUINTA PERGUNTA --------------")
escreval("")
escreval("Voc� acredita em SELE��O NATURAL?")
escreval("1- N�o")
escreval("2- Sim, acredito que a natureza seleciona os mais fortes para determinado ambiente")
escreval("3- Acredito que a natureza n�o seleciona mais devido a moderniza��o dos humanos")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- SEXTA PERGUNTA --------------")
escreval("")
escreval("Voc� acredita que, se houver um deus, ele � atemporal?")
escreval("1- Sim, dez anos para n�s pode ser um segundo para ele")
escreval("2- E existe um deus?")
escreval("3- Se ele for, acho que nem est� percebendo isso")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- S�TIMA PERGUNTA --------------")
escreval("")
escreval("Voc� concorda que a aus�ncia do dente do siso � uma demonstra��o de evolu��o?")
escreval("1- N�o, acredito que isso seja uma adapta��o e n�o uma evolu��o")
escreval("2- Sim, � uma clara refer�ncia � evolu��o das esp�cies em n�s mesmos")
escreval("3- Talvez, mas n�o quer dizer que seja uma prova plena sobre evolu��o")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- OITAVA PERGUNTA --------------")
escreval("")
escreval("Voc� acredita que as escrituras sagradas explicam a cria��o do universo?")
escreval("1- Sim, l� tem todas as respostas")
escreval("2- N�o, n�o se passa de um livro")
escreval("3- Se elas estiverem certa, com certeza s�o bem valiosas")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- NONA PERGUNTA --------------")
escreval("")
escreval("Qual sua opini�o sobre os F�SSEIS?")
escreval("1- S�o somente um monte de ossos de um ser j� morto, revelando-nos o passado")
escreval("2- S�o uma das maiores provas sobre a evolu��o, se for um f�ssil muito antigo")
escreval("3- Ele pode providenciar v�rias informa��es, mas n�o necessariamente da evolu��o")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
escreval("")
escreval("Voc� quer continuar? SIM ou N�O?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inv�lida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- D�CIMA PERGUNTA --------------")
escreval("")
escreval("E por �ltimo, em qual teoria voc� acredita ser a mais plaus�vel?")
escreval("1- Acredito no evolucionismo")
escreval("2- Acredito no criacionismo")
escreval("3- Nenhum dos dois/Em partes dos dois")
escreva("Resposta: ")
leia(f)
escolha(f)
caso 1
b<-b+1
caso 2
c<-c+1
caso 3
d<-d+1
fimescolha
limpatela

// Resultados
escreval("")
escreval("-------------- RESULTADOS --------------")
escreval("")
se(b>c)e(b>d)entao
escreval ("Voc� � CRIACIONISTA.")
senao
se(c>b)e(c>d)entao
escreval("Voc� � EVOLUCIONISTA.")
senao
se(d>b)e(d>b)entao
escreval("Voc� corta para os dois lados, ou � somente indeciso.")
senao
fimse
fimse
fimse
escreval("Obrigado por ter utilizado nosso programa!")
escreval("")
escreval("------")
escreval("Montagem: Kevin")
escreval("Design: Joel")

fimalgoritmo



