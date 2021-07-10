algoritmo "Quiz"

var
a:literal
b,c,d,f:inteiro

inicio
// Intro
escreval("--- Quiz: Criacionista ou Evolucionista? ---")
escreval("Digite SIM se quiser fazer o quiz ou NÃO se não quiser.")
leia(a)
se(a="Sim")entao
senao
se(a="Não")entao
escreval("Obrigado pela presença. Pressione ESC para sair.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela

// Primeira pergunta
escreval("Digite o número da alternariva (1,2,3) para dar sua resposta.")
escreval("")
escreval("-------------- PRIMEIRA PERGUNTA --------------")
escreval("")
escreval("Você possui uma religião?")
escreval("1- Sim, possuo uma religião")
escreval("2- Não, sou ateu/irreligioso")
escreval("3- Sou indeciso/agnóstico")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- SEGUNDA PERGUNTA --------------")
escreval("")
escreval("Em qual dessas teorias você acredita?")
escreval("1- Acredito na criação da Terra por um ser superior")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="não")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- TERCEIRA PERGUNTA --------------")
escreval("")
escreval("Você concorda que nós temos um parentesco com os primatas?")
escreval("1- Não, não acredito")
escreval("2- Sim, acredito")
escreval("3- Não sei dizer")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="nao")entao
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- QUARTA PERGUNTA --------------")
escreval("")
escreval("Você acredita que a evolução da vida na Terra foi formada em pouco tempo?")
escreval("1- Sim, com a devida velocidade do criador")
escreval("2- Não, a formulação da vida durou milhões de anos")
escreval("3- Não sei dizer")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="não")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- QUINTA PERGUNTA --------------")
escreval("")
escreval("Você acredita em SELEÇÃO NATURAL?")
escreval("1- Não")
escreval("2- Sim, acredito que a natureza seleciona os mais fortes para determinado ambiente")
escreval("3- Acredito que a natureza não seleciona mais devido a modernização dos humanos")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- SEXTA PERGUNTA --------------")
escreval("")
escreval("Você acredita que, se houver um deus, ele é atemporal?")
escreval("1- Sim, dez anos para nós pode ser um segundo para ele")
escreval("2- E existe um deus?")
escreval("3- Se ele for, acho que nem está percebendo isso")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- SÉTIMA PERGUNTA --------------")
escreval("")
escreval("Você concorda que a ausência do dente do siso é uma demonstração de evolução?")
escreval("1- Não, acredito que isso seja uma adaptação e não uma evolução")
escreval("2- Sim, é uma clara referência à evolução das espécies em nós mesmos")
escreval("3- Talvez, mas não quer dizer que seja uma prova plena sobre evolução")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- OITAVA PERGUNTA --------------")
escreval("")
escreval("Você acredita que as escrituras sagradas explicam a criação do universo?")
escreval("1- Sim, lá tem todas as respostas")
escreval("2- Não, não se passa de um livro")
escreval("3- Se elas estiverem certa, com certeza são bem valiosas")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- NONA PERGUNTA --------------")
escreval("")
escreval("Qual sua opinião sobre os FÓSSEIS?")
escreval("1- São somente um monte de ossos de um ser já morto, revelando-nos o passado")
escreval("2- São uma das maiores provas sobre a evolução, se for um fóssil muito antigo")
escreval("3- Ele pode providenciar várias informações, mas não necessariamente da evolução")
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
escreval("Você quer continuar? SIM ou NÃO?")
leia(a)
se(a="sim")entao
senao
se(a="nao")
escreval("Dados insuficientes. Precisa terminar o quiz.")
fimalgoritmo
senao
escreval("ERROR 404. Resposta inválida.")
fimalgoritmo
fimse
fimse
limpatela
escreval("")
escreval("-------------- DÉCIMA PERGUNTA --------------")
escreval("")
escreval("E por último, em qual teoria você acredita ser a mais plausível?")
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
escreval ("Você é CRIACIONISTA.")
senao
se(c>b)e(c>d)entao
escreval("Você é EVOLUCIONISTA.")
senao
se(d>b)e(d>b)entao
escreval("Você corta para os dois lados, ou é somente indeciso.")
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



