const carro = {
    nome: "Uno",
    marca: "Fiat",
    ano: 2003,
    cor: "bege",
    acessorios: {
        airBag: "Frente total",
        rodas: "Aro 14",
        travas: "eletrica",
    },
    numeroRodas: 4,
    revisado: true,
    numeroRevisoes: ["primeira","Segunda","Terceira","Quarta: não fez","Quinta","Sexta"],
    motor: '1.0'
}

console.log(carro)
// console.log('-----------------------------------------')
// console.log(`O carro ${carro.nome} do ano ${carro.ano} tem status revisado como: ${carro.revisado}`)
// console.log('-----------------------------------------')
// console.log(`Os acessórios do carro ${carro.nome} são vários, mas o mais caro é o Air Bag ${carro.acessorios.airBag}`)

let texto = JSON.stringify(carro) // O método strigify converte de OBJETO para TEXTO
console.log(texto)

let voltaObjeto = JSON.parse(texto) // O método parse converte o JSON de TEXTO para OBJETO
console.log(voltaObjeto)