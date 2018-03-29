const Pilha = require('./pilha')
const Gramar = require('./gramar')

let oGramar = null

oGramar = Gramar.getGramar()

Pilha.atribuiValores(oGramar)

