let loRet = {}
let SimboloInicial = `S`

/* GRAMATICA
 x = {N, T, P, S}

 x = Sentenca
 N = Nao terminal
 T = Terminal
 P = producao
 S = Simbolo inicial 

*/

loRet.aNaoTerminal = [`a`, `b`]
loRet.aTerminal = [`S`]
loRet.cSimboloInicial = SimboloInicial
loRet.aProducao = {
    S: {
        prod1: [`a`, `S`, `b`], prod2: [`a`, `b`]
    }
}

module.exports.getGramar = function () {
    return loRet
}

module.exports.getProd = function () { // ISSO AKI FOI UMA GAMBIS Q TIVE Q FAZE
    let chanfes = {
         
            prod1: [`a`, `S`, `b`], prod2: [`a`, `b`]
        
    }

    return chanfes
}