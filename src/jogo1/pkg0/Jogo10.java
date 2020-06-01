/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo1.pkg0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arnaldo,Vitor
 */
public class Jogo10 {
    
    public static int nivel = 100;
    public static String nomedousuario;


    public static void main(String[] args) {
        int iniciarm;
        String msg;
        String res;
        int vulnerabilidade = 100;
        Scanner sc = new Scanner(System.in);
        int opcao, loop = 0;
        msg ="                                               @  CYBER PUNK 1.0  @                   \n"
                + "....................................................         ...........................................................\n"
                + ".............................................. (A#JC,,*!!¶,,!¶!ë,,.ëëë  ................................................\n"
                + "..........................................!A–3J!(=!,ëëë\",\"*\"ë*..,..ëë.. . ..............................................\n"
                + "..................................... ,M%C%¶¶(!*,\",,\"¶*ë.. .... ....\" .ë.....ë  ........................................\n"
                + "....................................A@5%A=¶!J\"*¶,. ë ,  . ...........  .... ... ........................................\n"
                + "................................. A@$5ÆJ7*!,ë*\"\"ëë....  .ëë.ëëëëëë. ..  .. .......ë*....................................\n"
                + "...............................\"53JC–@$,!!=ëëë..,.ë .\".\".. ë. ...ë . . .............ë*..................................\n"
                + "..............................–@%JM#C=7!¶\"ëëë. ë ë.\".ë.....ë .ë . .ëë. .....ë.. ...ë ..\"ë...............................\n"
                + "............................@–A$MA#=¶¶,(,*\", ë\"\".ëë. ë .  . .ë.  .ë ... ............ë.!..ë,.............................\n"
                + "......................... .@@@5M#3=¶¶¶,,!,ë.\".\",..ë...ë. .ë\"ëë.\" .ë.. ............  ë ë,\"..,............................\n"
                + "..........................55WÆ–%$$(==,*\"*ë\"\"\" \"ë ë .. .ë . ... . .ë.ë.ë... ........  . ,...\"\"...........................\n"
                + "........................¶5$–WW5–5$37(=*.!ë.ëë.ë....ë ë!.ë. .. .ë..ë..\"ë.... ...........*\"*..\"ë .........................\n"
                + ".......................\"%%A@MMA–5%$!*!,ëë,.ëë.ë\"ë,\"ëë\".. .\". ë.ë . ...ëë\" ë.... .  . ...ë.ëë.\"* ........................\n"
                + "......................ë3A#@A@M%M%#J!¶(,*\"ëë,\" ë\"ë\"ë. \"...ë..ëëë.ë.\" .ëëë,.......... ..*\"ë¶\"ë.ë\" ........................\n"
                + "..................... 5%3@@#–ÆA@%%CC,,,\"¶*,,ë \"ë\". ,.\"ë,.ë. .ë ..ë .ëëë\",.\".. ....  .ëë\".¶*\"ë\"\"\"........................\n"
                + "..................... J$%%@@WÆ##55A¶=,(*! ,ë.,. ...\"ëëë,.ë.ë.. ë ....ë......ëë..... ..ëëë*,,\".,!........................\n"
                + ".....................,%37#5#WÆ–J–3JCC¶(,¶\"!¶!ë*.ëëë,ë .ë.,..ë.ëë..ë ..ë.. .ë ...... . ë*.\"¶\"ëë,(........................\n"
                + ".................... C$7JAA–@WMC@MA7=!¶(=*!ë\"\"*ë\"ëë\".ë\"**ëë\".ë.\"ë.ë.\".ëëëë,\".,ë\"...  ..\"..ë.ëë\"¶ë ......................\n"
                + ".....................(JAA@A#–##–%5$C7¶=(*¶*!\"\"!.\"..**\"ë!*ë\",\"ë.\"ë..... ë,ë*, ë..\".ë.,,,ë*ë.ë,\"\"(\" ......................\n"
                + "..................... $33A$#W–MM$@3=7(!!((,(¶ë!,,.ë\"...ë,\"\"*\"\"\"\",.!ëë.\".\"ë..... ....!..%¶ë¶!.,\",\" ......................\n"
                + "......................AC7J%––WÆWA55JJ7==(¶¶(7==¶(\",*¶,..ë.,ë(,*!\"ë\"*J7=(¶¶=!*.¶¶, , ,\"==¶¶=ëë.*,. ......................\n"
                + "..................... –C353–%@WÆ%–JC7¶!,,,,!(=¶*¶!(¶J(,,ë\"\"ë,\"¶CCJ****\".,¶ë.ë,ëëë.!,.,$=((*.ë.\"¶........................\n"
                + "......................A$C355#Æ@W@A*¶..ë.ë.ë.ëë*5((==73C(*!ë,¶!7*\"ë\"\"\".,ëë\"ë *\"*\"¶,,,¶¶A=7*ëë,\"ë=........................\n"
                + ".......................WC%A%$–5Æ%7,.! !7((MÆÆÆÆÆÆÆM5#J=77J((C%ë\"\"C\"*\"*$@Æ–%7ëëëëë!ë*\".%7!ë.\",,,. .......................\n"
                + ".......................5=3%3%W#–A=CA–ÆÆMÆMMMMÆMÆMÆÆÆW5A–#Æ$A%JC7¶C3#ÆMM@MMWMÆMÆ$,!...ë*7*,ë\"!*!. .......................\n"
                + ".......................C5AJC5A–==MÆÆÆMWÆWMÆÆM–@M@ÆÆÆWÆ5WÆ#A#JC=#$$ÆÆÆ–ÆÆWMM@M5@#WWM7ë!!77=¶¶!**ë........................\n"
                + "........................$$%3%WÆ3¶\"ÆWÆWÆM–ÆÆMÆÆÆÆ@–WW–M–WWC.¶  ¶(((WÆÆ#ÆM–M–Æ–Æ@–#––Æ$*.5CC!**!,.........................\n"
                + "..........................5$MM–ÆC*C¶(AÆMMÆMÆÆMMÆW#–WMÆ%JÆ7.C..(ë..–MM#WM–M@––@–Æ–M5–W(¶* $=*,¶..........................\n"
                + "..........................#@–––W7ëJ7(\"*J$MÆ5@–WWMWMM–ÆC%#(\",..¶*.¶7MMÆWWÆMÆ–@5––$WÆMW\"!,\" 7(¶...........................\n"
                + "........................  @%–W––3,JCC¶Cë\"37M@Æ#A–#–M#3–M$\"W–Æ=\"!!*(3%MMÆ–Æ##$55%A5#Æ¶\"!\"\".(C(...........................\n"
                + "..........................ë#$5–WMë,JA7=7W53@$CM–WÆ7!¶%W*$MÆ5Æ7*\"¶!.(3!!%WÆWÆM#M5#MM# *!!!..=............................\n"
                + "........................  #%$#A–Æ–*ëë=53J$W53–J,! .=AÆJÆMÆÆCMÆÆ(ë\" *. .A!(5MÆMMMMWA.,¶,*,..J............................\n"
                + "........................¶W#%A–MW5#–#5##%$7JA–AJ5(,(AWÆAÆÆÆÆAÆMÆ= \"\"\".\".ë..=@$%M$*\".C. *. \"ë\". ..........................\n"
                + ".........................@%%5M@5#AWA%J(%=JC7JC77$A–#W––W@MÆ%#ÆÆ7..ëë.\"ë¶*,¶A¶((¶,.ë*...ë=(*ë(...........................\n"
                + "........................ =%%A$W#$AACA7¶==CJ77$#33A5–M(–3%–Æ#5ÆMÆ@..\" \",=J¶=J=7J(¶,,*.,\",*!ë\"C...........................\n"
                + "...........................@%@–@#%¶*–¶(.ë\"!¶%JC$J#A5@=W%%@–AÆÆÆ#W.\"ë.. ¶.=¶=!!*\"*!*ë*¶ë\"*.ë¶............................\n"
                + "............................ ÆW5#$7*C¶7\"....7C$$$5A@@Æ3MWMM%WÆMÆC\"*.. *\"*!¶¶¶!¶,*\"\"ëJ! ¶.=\"ë............................\n"
                + "...............................#55J3C7CA3¶, ë\"JAA@A#=JA\"C7@$J$–3.*,. ëë!!(*¶C$A\",\"\",\"**$ ...............................\n"
                + "...............................\"ÆM––WM5  ..A*ëCA%5@$7=,,$\"ë(.,=! \"., ë\",**C=3¶–#A@@5$=!.................................\n"
                + "................................–#A555–*... 5C3A#%@*ë!\".!$–*!ë\"!ë\"\".  \" !( .. JWC7( *,..................................\n"
                + "................................¶#A#5@–A.  ëÆCJ$AAJ7.*. ¶ëëC.. . ë! .ë\".ë .  .–%=*ë ë ..................................\n"
                + "................................ –A$@5#–(..%A$%J!=7¶ ..\"\"  ¶. .,.!,,.\".ë\"3...ë5(=...*...................................\n"
                + "................................ëWA$A#J––A..5#3#W–3#$=¶¶*¶!(...¶C3!%%=$$C( ..#5\"¶ë. ....................................\n"
                + "................................ WAC%5%!%$@\"7(C*.$3\"W*\"%!ë*(ë 3(,.!=.$ëë!= .%$(.C\"ë!....................................\n"
                + ".................................5%CJ5A!%–@$W–=*$@7ëA!.=.  ¶ë..!..3=.(*,=ë AJA,.!\"*!....................................\n"
                + ".................................–$CC5!AJÆ##A–7(5%(.=\".¶,,,\"...(ë\"#,C7*\".$=,=! =,\"¶\"....................................\n"
                + ".................................353¶A3=3!J–A%W3¶==!*JJC#AJ=35..¶..7ë\" C7\"ë!ë *\".,.*....................................\n"
                + "............................... $3%=$A$3CCC%–AAJJ@=(=*=.!ëë,(.ë !.ë(5(\"*(ë\"!.(,.*ë......................................\n"
                + ".................................@A=7C$$355$#%#@@JJC7¶C¶3W%3ë#%5¶(¶\"=J¶\"....!\"\"\"\"..ë....................................\n"
                + "................................ ë@A3C$$73#%3AJ%=JC%JJ%7¶JJ!J$JCC*ë,*,,\"ë,.\",,ë(\"\".\"....................................\n"
                + "................................. ...ë@%555@(3A#7JC(=*7ë\"¶*7ë ...!ë\"¶¶¶,.Cë\"ë !!=C......................................\n"
                + "........................................¶J#%$5C%5C7¶\",,(,.\"!ëë\"ë*\",(*5 ëë\"  ,¶=.........................................\n"
                + "......................................... 75J¶J$*¶*!,*¶=!!¶¶\",*,\"ë\"ë,ë\". . *\"...........................................\n"
                + "............................................ë@5$3¶,ë.¶¶, .=\"\" \"....,\"\" .¶%3.............................................\n"
                + "................................................J$7=,*.ë..!,\"..\"*ë...=. ................................................\n"
                + "...................................................¶J¶CCC7J7CJ7C!(7,....................................................\n"
                + ".....................................................    ...............................................................";
                TextoLento(msg, 5);
        do {

            System.out.print("<1> Jogar \n<2> Instruções \n<3> Créditos \n<4> Sair : ");
            System.out.println(" \nusuario@kali : ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Por favor digite o seu nome de usuário : ");

                    nomedousuario = (sc.next() + "@kali : ");
                    System.out.println("******************************************************************************************************************************");
                    System.out.println("DAEKNETRECRUTADOR@kali : O computador não é um dos mais modernos, más o intel atom com 1gb de ram da conta :) ");

                    System.out.println("*******************************************************************************************************************************");
                    System.out.println("Defesa do sistema : " + vulnerabilidade + "%");
                    System.out.println("********************************************************************************************************************************");
                    System.out.println("Você : hmm vamos lá, acabei de receber uma notificação da darknet, o pessoal quer testar os seus conhecimentos");
                    System.out.println("*********************************************************************************************************************************");
                    System.out.println("Digite 1 para começar e 0 para sair : ");
                    iniciarm = sc.nextInt();
                    
                    
                    if (iniciarm == 1) {
                        vulnerabilidade = vulnerabilidade + Tutorial();
                        System.out.println("** AVAST PREMIUM CRACKEADO 1.0 INSTALADO.  \n Defesa do sistema: " + vulnerabilidade + "%");
                        msg = "DARKNETRECRUTADOR@kali : HMM, Você tá sabido hein !! \n vamos partir para algo mais hardcore... \nO NIGHTMARE@KALI precisa de uma ajuda... \nvá até a conexão pública mais próxima da localização enviada em seu celular, chegando lá busque pelo IP: 177.102.44.83\n";
                        TextoLento(msg, 30);
                        msg = "NIGHTMARE@KALI: Existem 3 servidores online\nvocê possui 5 chances para acertar qual é o servidor, errar não é uma opção, BOA SORTE. \n(Digite 1,2 ou 3 para acertar) ";
                        TextoLento(msg, 30);
                        missao1(0);
                        
                        System.out.println("\n");
                        
                        //missão 2 main
                        vulnerabilidade = vulnerabilidade + missao2();
                        System.out.println("Defesa do sistema : " + vulnerabilidade);
                        
                        msg = "NIGHTMARE@KALI : aaahmm.. novato sua missão agora pode ser meio tenebrosa.. \n";
                        TextoLento(msg,30);
                        
                        msg = "NIGHTMARE@KALI : Bom, naquele servidor peguei algumas informações, vamos precisar contatar um assassino \n";
                        TextoLento(msg,15);
                        System.out.println(nomedousuario + "Mas porque ????");
                        
                        System.out.println("NIGHTMARE@KALI : Eram informações confidênciais, coisa de politico, depois te explico, \n Você vai orientar o sniper através de um semáforo... \n hackeando um semáforo você vai precisar dar um sinal verde para o disparo do tiro..");                        
                        
                        System.out.println(nomedousuario + "QQQQQ ????????");
                        
                        //missão 3 main
                        System.out.println("**manual do semáforo online** \n Quando as maiores cargas de energia são iguais a saída do semáforo é verde \n diferente disso é vermelho. ");
                        System.out.println("Aponte para a saida verde ");
                        
                        System.out.println("    A B");
                        System.out.println("A)  0 0\nB)  0 1\nC)  1 0\nD)  1 1");
                        System.out.print(nomedousuario);
                        vulnerabilidade = vulnerabilidade + missao3(sc.next());
                        System.out.println("Score na darknet : " + nivel);
                        System.out.println("Defesa do sistema : " + vulnerabilidade);
                        //missao4 main
                        msg = "NIGHMARE@KALI : Mano, acho que temos muitas coisas em comum, temos um futuro promissor...";
                        TextoLento(msg,30);
                        
                        System.out.println("NIGHMARE@KALI : Então mano, consiguimos aparecer na tv, a mídia está dando ouvido para a darknet");
                        
                        msg = "NIGHMARE@KALI : Então vamos para a proxima ação...";
                        TextoLento(msg,30);
                        System.out.print("NIGHMARE@KALI: Cara vou desativar a chave de segurança dos sevidores do governo por uma hora");
                        System.out.print("\nNIGHMARE@KALI:Só pra dar um recado, o código criptografado é 1 10 100 1000 10000 10000 1000000");
                        msg = "NIGHMARE@KALI: você sabe quais são esses números em binário ?";
                        TextoLento(msg,30);
                        System.out.println("(Digite os números respectivamente com espaço)");
                        System.out.println(nomedousuario);
                        sc.reset();
                        vulnerabilidade = vulnerabilidade + missao4(sc.next());
                        System.out.println("Score na darknet : " + nivel);
                        System.out.println("Defesa do sistema : " + vulnerabilidade);
                        
                        //Contexto da história.
                        System.out.println(nomedousuario + " Mano a gente não se conhece muito bem, me conte um pouco sobre você ? ");
                        msg = "NIGHTMARE@KALI : AHH.. é meio complicada";
                        TextoLento(msg,40);
                        System.out.println("NIGHTMARE@KALI :  Quando eu tinha 14 anos minha irmã morreu por conta de sua condição rara...");
                        System.out.println("NIGHTMARE@KALI : Bom existia um único medicamento que o mantia viva");
                        msg = "NIGHTMARE@KALI : Ela faleceu por falta da medicação, houve um desvio de verba pública na região que eu moro, \n NIGHTMARE@KALI : várias pessoas ficaram sem medicamentos, mas nós n podiamos pagar pelo remédio, foi isso..";
                        System.out.println("NIGHTMARE@KALI : Agora eu faço parte dessa organização, contra corruptos na darknet.");
                        TextoLento(msg,40);
                        msg = nomedousuario + " Caramba mano, eu lamento vamos fazer isso por ela, e por todas as outras pessoas";
                        TextoLento(msg,30);
                        sc.reset();
                        
                        msg = "\nNIGHTMARE@KALI : Bem vindo Novato, a missão de hj vamo voltar no tempo\n"
                                + "NIGHTMARE@KALI : Conseguimos uma senha no mercado negro, de um servidor que está ativo a mais de 40 anos,\n"
                                + "NIGHTMARE@KALI : e depois do pessoal estudar ele decobrimos que essa senha é em octal, voce vai precisar transformar\n"
                                + "NIGHTMARE@KALI : a senha de decimal pra octal e digitar no servidor, a senha é: 55731 lembre-se voce precisa digitar esse valor em octal";
                        TextoLento(msg,40);
                        res = sc.nextLine();
                        vulnerabilidade = vulnerabilidade + missao6(res);
                        
                        vulnerabilidade = vulnerabilidade + missao5();
                        
                        }

                    loop = 1;
                    break;
                case 2:
                    System.out.println("Jogo em desenvolvimento... é um rpg cuja suas escolhas influênciam na sua progressão.");
                    loop = 1;
                    break;
                case 3:;

                    System.out.println("Desenvolvedores Vitor, Arnaldo,Renan,Julio. Produção independente para o desenvolvimento academico na instituição SENAC");
                    loop = 1;
                    break;
                case 4:
                    System.out.println("Fim.");
                    loop = 0;
                    break;

            }

        } while (loop == 1);

    }

    //Função para desacelerar o texto, mensagem = texto, tempo é o tempo que aparece na tela.
    public static void TextoLento(String mensagem, long tempo) {
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(mensagem.charAt(i));
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
     //tutorial.
    static int Tutorial() {
        Scanner sc = new Scanner(System.in);
        int premio = 0;
        int resposta;
        String mensagem = "****Bem Vindo ao tutorial de Defesa, \nA Defesa é praticamente a sua vida, se ela chegar a 0 voce será rastreado e preso.\n Seu total de Defesa é 100 a cada desafio voce ganha mais Defesa ou perde se errar os desafios,\n agora vamos testar se o sistema funciona";
        TextoLento(mensagem, 30);
        
        System.out.println("\nO numero binário 0001 equivale a quanto em decimal ?.");
        resposta = sc.nextInt();
        
        if (resposta == 1) {
            System.out.println("Resposta correta + 10 Defesa Como bonus");
            premio = premio + 10;
        } else {
            System.out.println("Resposta errada, Voce não perdeu nada dessa vez");
        }
        return premio;
    }
        //A primeira missão não pesa na pontuação, pois o método de acertividade é aleatório.
        public static void missao1(int a) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {

            System.out.print(nomedousuario);
            a = scan.nextInt();

            Random gerador = new Random();
            int valorgerado = gerador.nextInt(2) + 1;

            if (a == valorgerado){
                System.out.println("IP: 177.102.44.83");
                System.out.println("@NIGHMARE : Ótimo novato, você é demais !");
                break;
            }else{
                System.out.println("ERRO IP: 177.102.44.8" + valorgerado);
                System.out.println("@NIGHTMARE : MANO N F0@#");
                
                 if(i == 4){
                     System.out.println("");
                 System.out.println("@NIGHTMARE : Caramba, você mal entra na parada e já começa me lascando... \n eu poderia ter sido preso.");
                 
                 }
                }
               }
              }
    
        //finaliza missão 1, inicia missão 2.
        static int missao2(){

        int premio = 0;
        char resp;
        int loop = 0;
        int iniciarm;

        Scanner sc = new Scanner(System.in);
        String msg;
        List<Integer> numbers = Arrays.asList(00111111, 1101010, 11101010, 1011011);
        List<String> palavras = Arrays.asList("00111111", "1101010", "11101010", "1011011");
        
        System.out.println("S=A+B+C");
        msg = ("A  B  C\n"
                + "0  0  0 \n"
                + "0  0  0 \n"
                + "0  0  1 \n"
                + "0  0  1 \n"
                + "0  1  0 \n"
                + "0  1  0 \n"
                + "0  1  1 \n"
                + "0  1  1 \n");
        TextoLento(msg, 30);
        do {
            Collections.shuffle(palavras);
            System.out.println("Valor de S \n(a)" + palavras.get(0) + "\n(b)" + palavras.get(1) + "\n(c)" + palavras.get(2) + "\n(d)" + palavras.get(3));
            resp = sc.next().charAt(0);
            resp = Character.toLowerCase(resp);
            if (resp == 'a') {
                if(palavras.get(0) == "00111111"){
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;
                    break;
                }else{
                    System.out.println("Resposta incorreta");
                }
            }else if(resp == 'b') {
                if(palavras.get(1) == "00111111"){
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;
                    break;
                }else{
                    System.out.println("Resposta incorreta");
                }
            } else if(resp == 'c') {
                if (palavras.get(2) == "00111111"){
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;
                    break;
                }else{
                    System.out.println("Resposta incorreta");

                }
             }else if (resp == 'd') {
                if (palavras.get(3) == "00111111") {
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;

                }else{
                    System.out.println("Resposta incorreta");
                    

                }
               }else{
                System.out.println("Resposta incorreta");
            }
            loop++;
            premio = premio - 10;
        } while (loop < 3);
        
        if(premio < 0){
            premio = -10;
        }
        return premio;
    }
    //Fim missão2.
       
//Missão3.
        public static int missao3(String a){
         int premio;
          if(a.equals("d")){
              System.out.print("O sniper acertou o tiro ! \n");
              premio = 10;
              nivel = nivel + 100;
              System.out.println("NIGHTMARE@KALI : Acabamos de matar a nossa ponta solta, ele é um investigador da policia federal de crimes cibernéticos \n NIGHTMARE@kali : Ele era um p%@* corrupto.");
         }else{
              System.out.print("O sniper errou o tiro ! \n");
              premio = - 30;
             nivel = nivel - 50;
               
              System.out.println("NIGHMARE@KALI : Isso não vai ser nada bom para a sua reputação...");
         }
          return premio;
         }  
//misssão4
      public static int missao4(String a){
          int premio = 0;
          if(a.equals("1 2 4 8 16 32 64 128")){
              System.out.println("NIGHTMARE@KALI : BOA MLK");
              nivel = nivel + 300;
              premio = 10;
          }else{
              System.out.println("NIGHTMARE@KALI : Vacilou mano.");
              nivel = nivel - 20;
              premio = premio - 50;
          }
        return premio;
      }
      
//missão5      
      static int missao5(){

        int premio = 0;
        char resp;
        int loop = 0;
        int iniciarm;

        Scanner sc = new Scanner(System.in);
        String msg;
        List<String> palavras = Arrays.asList("2fd", "3e4", "2c", "e9");
        
        System.out.println("");
        msg = ("NIGHTMARE@KALI : Bom dia novato Adivinha?,/n"
                + "NIGHTMARE@KALI : Hoje é mais simples do que a ultima, nosso contato conseguiu um link de acesso, com os computadores da policia/n"
                + "NIGHTMARE@KALI : e a ultima mensagem que ele enviou foi o numero, 765, sabemos que precisamos achar o valor decimal no hd da policia/n"
                + "NIGHTMARE@KALI : para recuperar os dados");
        TextoLento(msg, 30);
        do {
            Collections.shuffle(palavras);
            System.out.println("Valor 765 \n(a)" + palavras.get(0) + "\n(b)" + palavras.get(1) + "\n(c)" + palavras.get(2) + "\n(d)" + palavras.get(3));
            resp = sc.next().charAt(0);
            resp = Character.toLowerCase(resp);
            if (resp == 'a') {
                if(palavras.get(0) == "2fd"){
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;
                    break;
                }else{
                    System.out.println("Resposta incorreta");
                }
            }else if(resp == 'b') {
                if(palavras.get(1) == "2fd"){
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;
                    break;
                }else{
                    System.out.println("Resposta incorreta");
                }
            } else if(resp == 'c') {
                if (palavras.get(2) == "2fd"){
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;
                    break;
                }else{
                    System.out.println("Resposta incorreta");

                }
             }else if (resp == 'd') {
                if (palavras.get(3) == "2fd") {
                    System.out.println("Resposta correta");
                    loop = loop + 99;
                    premio = premio + 10;

                }else{
                    System.out.println("Resposta incorreta");
                    

                }
               }else{
                System.out.println("Resposta incorreta");
            }
            loop++;
            premio = premio - 10;
        } while (loop < 3);
        
        if(premio < 0){
            premio = -10;
        }
        return premio;
    }
      public static int missao6(String b){
          int premio = 0;
          if(b.equals("154663")){
              System.out.println("NIGHTMARE@KALI : BOA MLK");
              nivel = nivel + 300;
              premio = 10;
          }else{
              System.out.println("NIGHTMARE@KALI : Vacilou mano.");
              nivel = nivel - 20;
              premio = premio - 50;
          }
        return premio;
      }
      
}
