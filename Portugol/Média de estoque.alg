algoritmo "Média de estoque"
// Função: Calcular o estoque médio das peças.
var
quant_min,quant_max,media:real
inicio
escreval("Nós iremos calcular o estoque médio de suas peças.")
escreval("Insira a quantidade mínima aproximada do estoque.")
leia(quant_min)
escreval("Insira a quantidade máxima aproximada do seu estoque.")
leia(quant_max)
limpatela
media<-((quant_min+quant_max)/2)
escreval("O estoque médio é...:",media)
fimalgoritmo
