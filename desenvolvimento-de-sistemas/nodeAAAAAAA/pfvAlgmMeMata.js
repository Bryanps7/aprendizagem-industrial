const readLineSync = require("readline-sync")
let charName
let choice = 0
let alive = true
let hasMoney = true
let ended = false
let hasSugar = false
console.log("=================================")
charName = readLineSync.question("Toda a historia possui seu protagonista...\nInsira o nome do protagonista desta historia: ")
console.log("=================================")
while((alive == true)&&(ended == false))
{
    console.log("==========================")
    console.log(charName," esta com muito tedio, a aula do Carlos esta lentamente\nO deixando insano... O que ",charName," deve fazer?")
    choice = readLineSync.question("(1) ir pra feira\n(2) ir embora\n(3) puxar o celular\n(4) se matar\n")
    console.log("==========================")
    switch (choice){
        case "1":
            console.log(charName," vai a feira! Ha muitas barraquinhas com coisas para se comprar...")
            choice = readLineSync.question("(1) Barraquinha de frutas\n(2) Barraquinha do pastel com Caldo de Cana\n(3) Barraquinha do camelo\n(4)retornar")
            switch(choice)
            {
                case "1":
                    if(hasMoney==true)
                    {    
                    console.log(charName," se aproxima da barraquinha de frutas! ",charName,"\n nota que tem pouco dinheiro! E entra em duvida se deve comprar uma goiaba ou pegar o onibus.")
                    choice = readLineSync.question("(1)pegar o onibus\n(2)comprar uma goiaba")
                        if(choice == "1")
                        {
                            console.log(charName," guarda seu dinheiro e compra a passagem do onibus! ",charName," entao retorna pra casa...\n\n\nFINAL 1: ONIBUS")
                            ended = true
                        } else if(choice == "2")
                        {
                            console.log(charName," decide comprar uma deliciosa goiaba! Tal como profecia do destino,\n",charName," tem sua goiaba roubada! Agora nao ha mais goiaba e nem passagem pra casa :(")
                            hasMoney = false
                        } else
                        {
                            console.log("opcao invalida! ",charName," fica confuso com as instrucoes, e se mata!")
                            alive = false
                        }
                    } else 
                    {
                        console.log(charName," decide se aproximar da barraquinha de frutas e comprar alguma coisa,\nporem, ",charName," nao tem dinheiro... O dono da barraquinha odeia pobres e da um tiro em ",charName,"!")
                        alive = false
                    }
                    break; 
                case "2":
                    if(hasMoney==true)
                    {    
                    console.log(charName," se aproxima da barraquinha do pastel com caldo de cana! ",charName,"\n nota que tem pouco dinheiro! E entra em duvida se deve comprar um pastel ou um caldo de cana...")
                    choice = readLineSync.question("(1) pastel\n(2) caldo de cana")
                        if(choice == "1")
                        {
                            console.log(charName," se dirige a barraquinha e compra um pastel!\nO pastel é uma delicia, porem tem muita gordura,\ne ",charName,"tem um infarto!")
                            alive = false
                        } else if(choice == "2")
                        {
                            console.log(charName," decide comprar um delicioso caldo de cana!\nporem esta tao doce que ",charName," decide guardar um pouco para depois!\n+1 copo meio cheio/meio vazio de caldo de cana.")
                            hasSugar = true
                            hasMoney = false
                        } else
                        {
                            console.log("opcao invalida! ",charName," fica confuso com as instrucoes, e se mata!")
                            alive = false
                        }
                    } else 
                    {
                        console.log(charName," decide se aproximar da barraquinha do pastel com caldo de cana e comprar alguma coisa,\nporem, ",charName," nao tem dinheiro... O dono da barraquinha odeia pobres e da um tiro em ",charName,"!")
                        alive = false
                    }
                    break;
                case "3":
                    if(hasMoney==true)
                    {    
                    console.log(charName," se aproxima da barraquinha do camelo! ",charName,"\n nota que tem pouco dinheiro! E entra em duvida de qual destes itens inuteis deve comprar...")
                    choice = readLineSync.question("(1) bugiganga\n(2) quinquilharia")
                        if(choice == "1")
                        {
                            console.log("uau! ",charName," compra uma brilhante bugiganga inutil!")
                            hasMoney=false
                        } else if(choice == "2")
                        {
                            console.log("uau! ",charName," compra uma incrível quinquilharia inutil!")
                            hasMoney=false
                        } else
                        {
                            console.log("opcao invalida! ",charName," fica confuso com as instrucoes, e se mata!")
                            alive = false
                        }
                    } else 
                    {
                        console.log(charName," decide se aproximar da barraquinha do camelo e comprar alguma coisa,\nporem, ",charName," nao tem dinheiro... O camelo odeia pobres e da um tiro em ",charName,"!")
                        alive = false
                    }
                    break;
                case "4":
                    console.log(charName," tenta retornar, mas se perde no caminho... ",charName," esta morto!")
                    alive = false
                    break;
                default:
                    console.log("opcao invalida! ",charName," fica confuso com as instrucoes, e se mata!")
                    alive = false
                    break;
            }
            break;
        case "2":
            console.log(charName," vai embora! porem, em seu caminho longo e arduo para casa, ele sente muita sede!")
            if(hasSugar==true)
            {
                console.log("com sorte, ",charName," havia recem adquirido um delicioso caldo de cana!\nAo tomar a quantidade restante do glorioso elixir de canavial,\n",charName," consegue chegar em casa!")
                console.log("FINAL 4: LAR DOCE LAR")
                ended=true
            } else
            {
                console.log("se apenas ",charname," tivesse algo para beber, ele poderia voltar para casa...")
            }
            break;
        case "3":
            console.log(charName," puxa o celular, agora são 10 minutos pra daqui a pouco!\nO que ",charName," fara agora?")
            choice = readLineSync.question("(1)Abrir o subway money\n(2)Abrir o zipzap\n(3)Guardar o telefone")
            switch(choice)
            {
                case "1":
                    if(hasMoney==false)
                    {
                        console.log(charName," puxa seu celular e abre o Subway Money! E o usa para\nfazer dinheiro! ",charName," agora tem dinheiro!")
                        hasMoney=true
                    } else
                    {
                        console.log(charName," abre o subway money e faz rios de dinheiro! Porem, como\n",charName," já tinha dinheiro, a receita federal o prende por fraude tributaria!")
                        console.log("FINAL 2: FRAUDE TRIBUTARIA")
                        ended = true
                    }
                    break;
                case "2":
                    console.log(charName," abre o Zip Zap! com quem que ",charName," gostaria de conversar?")
                    choice = readLineSync.question("(1) PIetro\n(2) mae\n(3) ???????")
                    if(choice=="1")
                    {
                        console.log("SMT")
                        console.log("sendo o dono do jogo, PIetro usa sua famosa frase de efeito para\nfazer com que ",charName," se mate!")
                        alive = false
                    }else if(choice=="2")
                    {
                        readLineSync.question(">VOCE E ADOTADO")
                        readLineSync.question("> BOBAO")
                    }else if(choice=="3")
                    {
                        console.log(">êã¨°)¨êã§°ºª§")
                        console.log("¨êºvã§°ª§")
                        console.log(">ã¨ °êê ",charName," êêª§")
                        console.log(">¨°ã§°ºª")
                        console.log("FINAL 3: ???????????????????")
                        ended = true
                    }else
                    {
                        console.log("opcao invalida! ",charName," fica confuso com as instrucoes, e se mata!")
                        alive = false
                    }
                    break;
                case "3":
                    console.log(charName," decide guardar seu telefone novamente, porem,\npuxar seu telefone em um local perigoso como este\nfaz com que ele seja assaltado! E morto!")
                    alive = false
                    break;
                default:
                    console.log("opcao invalida! ",charName," fica confuso com as instrucoes, e se mata!")
                    alive = false
                    break;
            }
            break;
        case "4":
            console.log(charName," se matou(?)")
            alive = false
            break;
        default:
            console.log("opcao invalida! ",charName," fica confuso com as instrucoes, e se mata!")
            alive = false
            break;
    }
}