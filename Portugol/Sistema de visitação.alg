algoritmo "Sistema de Visitacao"
// Para este algoritmo, eu fiz um sistema que comparasse o nome 
// de uma cidade e retornasse uma mensagem informando a distancia
var
nome,local:literal
inicio
escreval("---------------------")
escreval("---------------------")
escreval("Sistema de visitacao")
escreval("---------------------")
escreval("---------------------")
escreval("Entre com o seu nome:")
leia(nome)
escreval("Qual local deseja visitar:")
leia(local)

se (local ="Rio de Janeiro") entao
escreval("Boa viagem, 100km")

senao
fimse

se (local ="Sao Paulo") entao
escreval("Congestionamento, 300km")

senao
fimse

se (local ="Cidade") entao
escreval("Viajar p/ longe, esta perdendo tempo")

senao
fimse



fimalgoritmo
