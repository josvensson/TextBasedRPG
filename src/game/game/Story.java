package game.game;

import game.character.player.Player;

//Klass som bara innehåller metoder som skriver ut varje del av storyn
public class Story {

    public static void printIntro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("BERÄTTELSEN");
        Game.printSeperator(30);
        System.out.println("Det har gått hundra år sedan Den Stora Tystnaden. Städerna i söder är tomma och tågen står kvar och rostar på spåren.");
        System.out.println("Människorna flydde, men Norrlands skogar vaknade. Nu vandrar gamla väsen mellan träden, och de är hungriga.");
        System.out.println("En natt kom Mörkerkungen ner från fjället och tog allt liv i din by. Du var ute i skogen och klarade dig, den enda som är kvar.");
        System.out.println("Nu finns bara en sak att göra. Du ska ta dig till Kebnekaises topp, besegra Mörkerkungen och få ljuset att återvända!");
        Game.anythingToContinue();
    }

    public static void printFirstActIntro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("AKT I - DEN TYSTA SKOGEN");
        Game.printSeperator(30);
        System.out.println("Du går in i den tysta skogen med yxan på ryggen. Granarna står så tätt att dagsljuset knappt når marken.");
        System.out.println("Byns gamla berättade om lyktgubbar som lockar vilsna ut i myrarna, och om mylingar som ropar efter den som går förbi.");
        System.out.println("\nEfter en lång dag av vandring hör du något andas bakom stammarna. Skogen vet att du är här.");
        System.out.println("Du bryr dig inte om varningarna. Du knyter näven hårt runt yxskaftet och går djupare in i mörkret.");
        Game.anythingToContinue();
    }

    public static void printFirstActOutro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("AKT I - SLUTET");
        Game.printSeperator(30);
        System.out.println("Du klarade den tysta skogen! Du lever fortfarande, och det är mer än de flesta som gått hit kan säga.");
        System.out.println("Du sjunker ner mot en mossbeklädd sten och torkar svett och dimma ur ansiktet. Långt borta tjuter en varg.");
        System.out.println("\nDu känner dig starkare, och striderna har lärt dig något. Du kan lära dig en ny förmåga!");
        Game.anythingToContinue();
    }

    public static void printSecondActIntro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("AKT II - DE ÖVERGIVNA BYARNA");
        Game.printSeperator(30);
        System.out.println("Skogen glesnar och du kommer till en övergiven by med röda stugor, svarta fönster och dörrar som står på glänt.");
        System.out.println("På en rostig skylt vid vägen står det fortfarande: Välkommen, hälsa på hos oss. Ingen har bott här på hundra år.");
        System.out.println("Det sägs att maran rider på dem som sover och att gastar vandrar i kyrkorna om natten.");
        System.out.println("Du vet att Kebnekaise ligger många dagars väg bort, men först måste du ta dig igenom byarna...");
        Game.anythingToContinue();
    }

    public static void printSecondActOutro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("AKT II - SLUTET");
        Game.printSeperator(30);
        System.out.println("Du tog dig igenom de övergivna byarna, och du lever fortfarande!");
        System.out.println("Framför dig bryter en bred älv av skogen, och bortom den reser sig fjällen mot en röd himmel.");
        System.out.println("Du vet att du inte kan sova här, så du tänder en liten eld bakom en rasad ladugård och sköter dina sår.");
        System.out.println("\nEfter allt du har sett känner du dig redo att lära dig ännu en förmåga.");
        Game.anythingToContinue();
    }

    public static void printThirdActIntro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("AKT III - ÄLVEN OCH FJÄLLEN");
        Game.printSeperator(30);
        System.out.println("Du går över den gamla stenbron och hör fiolspel under vattnet. Det är Näcken som lockar dig.");
        System.out.println("Bortom älven stiger fjällen, ödsliga och kalla, där troll och lindormar sägs ha vaknat ur sin sömn.");
        System.out.println("När du står vid foten av berget vet du att det inte finns någon väg tillbaka.");
        System.out.println("Nu återstår bara att kämpa dig uppåt och hoppas att du når toppen med livet i behåll...");
        Game.anythingToContinue();
    }

    public static void printThirdActOutro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("AKT III - SLUTET");
        Game.printSeperator(30);
        System.out.println("Du kom hela vägen upp. Du har besegrat fjällens alla väsen.");
        System.out.println("Framför dig ligger toppen av Kebnekaise, höljd i svart dimma, och ur den hörs ett lågt, hungrigt mullrande.");
        System.out.println("Du tänker på din by, de röda stugorna och människorna du förlorade, och du sköter dina sår.");
        System.out.println("Du får chansen att lära dig en sista förmåga innan du går in i dimman.");
        Game.anythingToContinue();
    }

    public static void printFourthActIntro() {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("AKT IV - MÖRKERKUNGEN");
        Game.printSeperator(30);
        System.out.println("Du kliver upp på toppen av Kebnekaise. Luften är iskall och stjärnorna syns som vassa nålar.");
        System.out.println("Mörkerkungen reser sig ur dimman, en jättelik skepnad av horn, is och svart skogsdunkel, och ser dig rakt i ögonen.");
        System.out.println("Han höjer en klubba av ben, det mäktigaste vapnet som finns i de här skogarna.");
        System.out.println("Nu finns inget kvar att säga. Du måste kämpa för alla som försvann...");
        Game.anythingToContinue();
    }

    public static void printEnd(Player player) {
        Game.clearConsole();
        Game.printSeperator(30);
        System.out.println("Grattis, " + player.getName() + "! Du besegrade Mörkerkungen och fick ljuset att återvända till Norrland!");
        Game.printSeperator(30);
        System.out.println("Dimman lyfter, och för första gången på hundra år faller morgonljus över skogarna.");
        System.out.println("Det här spelet är gjort av Johannes Svensson.");
        System.out.println("Jag hoppas att du gillade det!");
    }
}