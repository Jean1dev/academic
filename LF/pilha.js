const Grammar = require('./gramar')
let aNterminais = []
let aTerminais = []
var aProducao = []
let aProducaoTemp = null
let aSaida = []
let Sinicial = null
let aAuxiliar = null

module.exports.atribuiValores = function (toReceiv) {
    Sinicial = toReceiv.cSimboloInicial
    aNterminais = toReceiv.aNaoTerminal
    aTerminais = toReceiv.aTerminal
    aProducao = toReceiv.aProducao
    escolheProducao()
}

function escolheProducao() {
    let count, countProd
    count = Object.keys(aProducao).length
    countProd = Object.keys(aProducao.S).length
    if (countProd > 1) {
        let lnTemp
        lnTemp = geraNumeroAletatorio(countProd)
        juntaPilha(lnTemp)
    } else {
        juntaPilha(1)
    }
    analisaPilha()
}

function juntaPilha(tnParam){
    aAuxiliar = Grammar.getProd()
    if(aProducaoTemp == null){
        aProducaoTemp = eval('aProducao.S.prod' + tnParam)
    }else{
        temp = aProducaoTemp
        aProducaoTemp = eval('aAuxiliar.prod' + tnParam + '.concat(temp)')
    }
}

function geraNumeroAletatorio(tnParam){
    let lnTemp, max, min
    min = Math.ceil(1)
    max = Math.floor(tnParam + 1)
    lnTemp = Math.floor(Math.random() * (max - min)) + min
    return lnTemp
}

module.exports.setPilhaProducao = function (param) {
    for (var i = 0; i < param.length; i++) {
        aProducao.push(param[i])
    }

    this.analisaPilha()
}

function comparaElemento() {
    let elementoAserComparado

    elementoAserComparado = aProducaoTemp[0]

    if (aTerminais.includes(elementoAserComparado)) {
        //aSaida.push(elementoAserComparado)
        aProducaoTemp.splice(0, 1)
        escolheProducao()

    } else if (aNterminais.includes(elementoAserComparado)) {
        aSaida.push(elementoAserComparado)
        aProducaoTemp.splice(0, 1)

    }

    if (aProducaoTemp.length == 0) {
        printSaida()

    } else {
        analisaPilha()
    }
}

function analisaPilha() {
    comparaElemento()
}

function printSaida() {
    /*aSaida.forEach(element => {
        console.log(element)
    });*/

    console.log(`Saida`)
    for(var i = 0; i < aSaida.length; i++){
        console.log(aSaida[i])
    }
    console.log(`----------------------------------------------------------------`)
    console.log(`fim da saida, oq aparecer abaixo, desconsidere deus sabe-la oq e`)
    console.log(`----------------------------------------------------------------`)
    return
}



