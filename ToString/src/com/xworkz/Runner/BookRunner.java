package com.xworkz.Runner;

import com.xworkz.external.*;

public class BookRunner {
    public static void main(String[] args) {
        Warmth warmth = new Warmth("Warmth", "Quotes", 250);
        Warmth warmth1=new Warmth("Warmth","Quotes",250);
        System.out.println("both are same:"+warmth.equals(warmth1));
        System.out.println(warmth);
        System.out.println("manual :" + warmth.hashCode());

        System.out.println("");
        LoveinParis loveinParis = new LoveinParis("LoveinParis", "LoveStory", 500);
        LoveinParis loveinParis1 = new LoveinParis("LoveinParis", "LoveStory", 500);
        System.out.println("Both are same:"+loveinParis.equals(loveinParis1));
        System.out.println(loveinParis);
        System.out.println("manual: " + loveinParis1.hashCode());


        System.out.println("");
        Never never = new Never("Never", "Feeling", 800);
        Never never1 = new Never("Never", "Feeling", 800);
        System.out.println("Both are same:"+never.equals(never1));
        System.out.println(never);
        System.out.println("manual: " + never.hashCode());

        System.out.println("");
        Love love = new Love("Love", "LoveStory", 300);
        Love love1 = new Love("Love", "LoveStory", 300);
        System.out.println("Both are same:" + love.equals(love1));
        System.out.println(love);
        System.out.println("manual :" + love.hashCode());

        System.out.println("");
        Lost lost = new Lost("Lost", "Sad", 1000);
        Lost lost1 = new Lost("Lost", "Sad", 1000);
        System.out.println("both are same:"+lost.equals(lost1));
        System.out.println(lost);
        System.out.println("manual :" + lost.hashCode());

        System.out.println("");
        Itstartswithus itstartswithus = new Itstartswithus("It Starts With Us", "Lovely", 5000);
        Itstartswithus itstartswithus1 = new Itstartswithus("It Starts With Us", "Lovely", 5000);
        System.out.println("both are same:"+itstartswithus.equals(itstartswithus1));
        System.out.println(itstartswithus);
        System.out.println("manual :" + itstartswithus.hashCode());

        System.out.println("");
        ItEndsWithUs itEndsWithUs = new ItEndsWithUs("It Ends With Us", "Romantic", 5000);
        ItEndsWithUs itEndsWithUs1 = new ItEndsWithUs("It Ends With Us", "Romantic", 5000);
        System.out.println("both are same:"+itEndsWithUs.equals(itEndsWithUs1));
        System.out.println(itEndsWithUs);
        System.out.println("manual : " + itEndsWithUs.hashCode());

        System.out.println("");
        Ever ever = new Ever("Ever", "Forever", 600);
        Ever ever1 = new Ever("Ever", "Forever", 600);
        System.out.println("both are same:"+ever.equals(ever1));
        System.out.println(ever);
        System.out.println("manual :" + ever.hashCode());

        System.out.println("");
        EndlessDesire endlessDesire = new EndlessDesire("Endless Desired", "Endless", 650);
        EndlessDesire endlessDesire1 = new EndlessDesire("Endless Desired", "Endless", 650);
        System.out.println("both are same:"+warmth.equals(warmth1));
        System.out.println(endlessDesire);
        System.out.println("manual : " + endlessDesire.hashCode());

        System.out.println("");
        Always always = new Always("Always", "Love", 2500);
        Always always1 = new Always("Always", "Love", 2500);
        System.out.println("both are same:"+always.equals(always1));
        System.out.println(always);
        System.out.println("manual :" + always.hashCode());

        System.out.println("");
        BeMine beMine = new BeMine("Be Mine", "Love", 8000);
        BeMine beMine1 = new BeMine("Be Mine", "Love", 8000);
        System.out.println("both are same:"+beMine.equals(beMine1));
        System.out.println(beMine);
        System.out.println("manual :" + beMine.hashCode());

        System.out.println("");
        Callme callme = new Callme("Call Me", "Angry", 300);
        Callme callme1 = new Callme("Call Me", "Angry", 300);
        System.out.println("both are same:"+beMine.equals(beMine1));
        System.out.println(callme);
        System.out.println("manual :" + callme.hashCode());

        System.out.println("");
        CrazyLove crazyLove = new CrazyLove("Crazy Love", "love", 600);
        CrazyLove crazyLove1 = new CrazyLove("Crazy Love", "love", 600);
        System.out.println("both are same:"+crazyLove.equals(crazyLove1));
        System.out.println(crazyLove);
        System.out.println("manual :" + crazyLove.hashCode());

        System.out.println("");
        DayDream dayDream = new DayDream("Day Dream", "Dream", 400);
        DayDream dayDream1 = new DayDream("Day Dream", "Dream", 400);
        System.out.println("both are same:"+dayDream.equals(dayDream1));
        System.out.println(dayDream);
        System.out.println("manual :" + dayDream.hashCode());

        System.out.println("");
        Dear dear = new Dear("Dear", "Feeling", 300);
        Dear dear1 = new Dear("Dear", "Feeling", 300);
        System.out.println("both are same:"+dear.equals(dear1));
        System.out.println(dear);
        System.out.println("manual :" + dear.hashCode());

        System.out.println("");
        Dearlove dearlove = new Dearlove("Dear Love", "Romantic", 500);
        Dearlove dearlove1 = new Dearlove("Dear Love", "Romantic", 500);
        System.out.println("both are same:"+dearlove.equals(dearlove1));
        System.out.println(dearlove);
        System.out.println("manual :" + dearlove.hashCode());

        System.out.println("");
        EndlessLove endlessLove = new EndlessLove("Endless Love", "Endless", 400);
        EndlessLove endlessLove1 = new EndlessLove("Endless Love", "Endless", 400);
        System.out.println("both are same:"+endlessLove.equals(endlessLove1));
        System.out.println(endlessLove);
        System.out.println("manual :" + endlessLove.hashCode());

        System.out.println("");
        FirstKiss firstKiss = new FirstKiss("First Kiss", "Kissing", 750);
        FirstKiss firstKiss1 = new FirstKiss("First Kiss", "Kissing", 750);
        System.out.println("both are same:"+firstKiss.equals(firstKiss1));
        System.out.println(firstKiss);
        System.out.println("manual :" + firstKiss.hashCode());


        System.out.println("");
        FirstLove firstLove = new FirstLove("First Love", "Love Story", 600);
        FirstLove firstLove1 = new FirstLove("First Love", "Love Story", 600);
        System.out.println("both are same:"+firstLove.equals(firstLove1));
        System.out.println(firstLove);
        System.out.println("manual :" + firstLove.hashCode());


        System.out.println("");
        Forever forever = new Forever("Forever", "Romantic", 800);
        Forever forever1 = new Forever("Forever", "Romantic", 800);
        System.out.println("both are same:"+forever.equals(forever1));
        System.out.println(forever);
        System.out.println("manual :" + forever.hashCode());


        System.out.println("");
        Foreveryou foreveryou = new Foreveryou("Forever You", "Constant", 400);
        Foreveryou foreveryou1 = new Foreveryou("Forever You", "Constant", 400);
        System.out.println("both are same:"+foreveryou.equals(foreveryou1));
        System.out.println(foreveryou);
        System.out.println("manual :" + foreveryou.hashCode());


        System.out.println("");
        HeartBeat heartBeat = new HeartBeat("Heart Beat", "Mature", 650);
        HeartBeat heartBeat1 = new HeartBeat("Heart Beat", "Mature", 650);
        System.out.println("both are same:"+heartBeat.equals(heartBeat1));
        System.out.println(heartBeat);
        System.out.println("manual :" + heartBeat.hashCode());


        System.out.println("");
        HoldMe holdMe = new HoldMe("Hold Me", "Teen", 300);
        HoldMe holdMe1 = new HoldMe("Hold Me", "Teen", 300);
        System.out.println("both are same:"+holdMe.equals(holdMe1));
        System.out.println(holdMe);
        System.out.println("manual :" + holdMe.hashCode());


        System.out.println("");
        Hug hug = new Hug("Hug", "Adult", 600);
        Hug hug1 = new Hug("Hug", "Adult", 600);
        System.out.println("both are same:"+hug.equals(hug1));
        System.out.println(hug);
        System.out.println("manual :" + hug.hashCode());


        System.out.println("");
        HugMe hugMe = new HugMe("Hug Me", "Stromy", 500);
        HugMe hugMe1 = new HugMe("Hug Me", "Stromy", 500);
        System.out.println("both are same:"+hugMe.equals(hugMe1));
        System.out.println(hugMe);
        System.out.println("manual :" + hugMe.hashCode());


        System.out.println("");
        InLove inLove = new InLove("In Love", "Magiclove", 700);
        InLove inLove1 = new InLove("In Love", "Magiclove", 700);
        System.out.println("both are same:"+inLove.equals(inLove1));
        System.out.println(inLove);
        System.out.println("manual :" + inLove.hashCode());


        System.out.println("");
        Justus justus = new Justus("Just Us", "Sweet Romance", 350);
        Justus justus1 = new Justus("Just Us", "Sweet Romance", 350);
        System.out.println("both are same:"+justus.equals(justus1));
        System.out.println(justus);
        System.out.println("manual :" + justus.hashCode());


        System.out.println("");
        KissMe kissMe = new KissMe("Kiss Me", "Fantasy", 400);
        KissMe kissMe1 = new KissMe("Kiss Me", "Fantasy", 400);
        System.out.println("both are same:"+kissMe.equals(kissMe1));
        System.out.println(kissMe);
        System.out.println("manual :" + kissMe.hashCode());


        System.out.println("");
        Latenight latenight = new Latenight("Late Night", "Mutual", 300);
        Latenight latenight1 = new Latenight("Late Night", "Mutual", 300);
        System.out.println("both are same:"+latenight.equals(latenight1));
        System.out.println(latenight);
        System.out.println("manual :" + latenight.hashCode());


        System.out.println("");
        LostLove lostLove = new LostLove("Lost Love", "Eternal", 300);
        LostLove lostLove1 = new LostLove("Lost Love", "Eternal", 300);
        System.out.println("both are same:"+lostLove.equals(lostLove1));
        System.out.println(lostLove);
        System.out.println("manual :" + lostLove.hashCode());


        System.out.println("");
        LoveBIrds loveBIrds = new LoveBIrds("Love Birds", "Flying Love", 200);
        LoveBIrds loveBIrds1 = new LoveBIrds("Love Birds", "Flying Love", 200);
        System.out.println("both are same:"+loveBIrds.equals(loveBIrds1));
        System.out.println(loveBIrds);
        System.out.println("manual :" + loveBIrds.hashCode());


        System.out.println("  ");
        LoveNote loveNote = new LoveNote("Love Note", "Fresh Love", 700);
        LoveNote loveNote1 = new LoveNote("Love Note", "Fresh Love", 700);
        System.out.println("both are same:"+loveNote.equals(loveNote1));
        System.out.println(loveNote);
        System.out.println("manual :" + loveNote.hashCode());


        System.out.println("");
        Lovewish lovewish = new Lovewish("Love wish", "Fantasy", 350);
        Lovewish lovewish1 = new Lovewish("Love wish", "Fantasy", 350);
        System.out.println("both are same:"+lovewish.equals(lovewish1));
        System.out.println(lovewish.hashCode());

        System.out.println("");
        Mine mine = new Mine("Me and You", "Romance", 600);
        Mine mine1 = new Mine("Me and You", "Romance", 600);
        System.out.println("both are same:"+mine.equals(mine1));
        System.out.println(mine.hashCode());

        System.out.println("");
        MissYou missYou = new MissYou("Miss You", "Sad", 200);
        MissYou missYou1 = new MissYou("Miss You", "Sad", 200);
        System.out.println("both are same:"+missYou.equals(missYou1));
        System.out.println(missYou.hashCode());

        System.out.println("");
        MyAngel myAngel = new MyAngel("My Angel", "Fantasy", 750);
        MyAngel myAngel1 = new MyAngel("My Angel", "Fantasy", 750);
        System.out.println("both are same:"+myAngel.equals(myAngel1));
        System.out.println(myAngel);
        System.out.println("manual :" + myAngel.hashCode());


        System.out.println("");
        Nights nights = new Nights("Nights", "Teen", 1000);
        Nights nights1 = new Nights("Nights", "Teen", 1000);
        System.out.println("both are same:"+nights.equals(nights1));
        System.out.println(nights);
        System.out.println("manual :" + nights.hashCode());


        System.out.println("");
        Onechance onechance = new Onechance("One Chance", "Friendship", 800);
        Onechance onechance1 = new Onechance("One Chance", "Friendship", 800);
        System.out.println("both are same:"+onechance.equals(onechance1));
        System.out.println(onechance);
        System.out.println("manual :" + onechance.hashCode());


        System.out.println("");
        OneKiss oneKiss = new OneKiss("One Kiss", "Intimate", 450);
        OneKiss oneKiss1 = new OneKiss("One Kiss", "Intimate", 450);
        System.out.println("both are same:"+oneKiss.equals(oneKiss1));
        System.out.println(oneKiss);
        System.out.println("manual :" + oneKiss.hashCode());


        System.out.println("");
        Onlyme onlyme = new Onlyme("Only Me", "Possesive", 900);
        Onlyme onlyme1 = new Onlyme("Only Me", "Possesive", 900);
        System.out.println("both are same:"+onlyme.equals(onlyme1));
        System.out.println(onlyme);
        System.out.println("manual :" + onlyme.hashCode());


        System.out.println("");
        OnlyMine onlyMine = new OnlyMine("Only Mine", "Possesiveness", 550);
        OnlyMine onlyMine1 = new OnlyMine("Only Mine", "Possesiveness", 550);
        System.out.println("both are same:"+onlyMine.equals(onlyMine1));
        System.out.println(onlyMine);
        System.out.println("manual :" + onlyMine.hashCode());


        System.out.println("");
        OnlyYou onlyYou = new OnlyYou("Only You", "Spiritual", 499);
        OnlyYou onlyYou1 = new OnlyYou("Only You", "Spiritual", 499);
        System.out.println("both are same:"+onlyYou.equals(onlyYou1));
        System.out.println(onlyYou);
        System.out.println("manual :" + onlyYou.hashCode());


        System.out.println("");
        RedRose redRose = new RedRose("Red Rose", "Symbolic", 699);
        RedRose redRose1 = new RedRose("Red Rose", "Symbolic", 699);
        System.out.println("both are same:"+redRose.equals(redRose1));
        System.out.println(redRose);
        System.out.println("manual :" + redRose.hashCode());


        System.out.println("");
        SoulMate soulMate = new SoulMate("SoulMate", "Childhood", 550);
        SoulMate soulMate1 = new SoulMate("SoulMate", "Childhood", 550);
        System.out.println("both are same:"+soulMate.equals(soulMate1));
        System.out.println(soulMate);
        System.out.println("manual :" + soulMate.hashCode());


        System.out.println("");
        StayMine stayMine = new StayMine("Stay Mine", "Marriage", 900);
        StayMine stayMine1 = new StayMine("Stay Mine", "Marriage", 900);
        System.out.println("both are same:"+stayMine.equals(stayMine1));
        System.out.println(stayMine);
        System.out.println("manual :" + stayMine.hashCode());


        System.out.println("");
        SweaterWeather sweaterWeather = new SweaterWeather("Sweater Weather", "Nature", 1500);
        SweaterWeather sweaterWeather1 = new SweaterWeather("Sweater Weather", "Nature", 1500);
        System.out.println("both are same:"+sweaterWeather.equals(sweaterWeather1));
        System.out.println(sweaterWeather);
        System.out.println("manual :" + sweaterWeather.hashCode());


        System.out.println("");
        SweatHeart sweatHeart = new SweatHeart("Sweat Heart", "Classic", 200);
        SweatHeart sweatHeart1 = new SweatHeart("Sweat Heart", "Classic", 200);
        System.out.println("both are same:"+sweatHeart.equals(sweatHeart1));
        System.out.println(sweatHeart);
        System.out.println("manual :" + sweatHeart.hashCode());


        System.out.println("");
        TextMe textMe = new TextMe("Text Me", "Flirty", 700);
        TextMe textMe1 = new TextMe("Text Me", "Flirty", 700);
        System.out.println("both are same:"+textMe.equals(textMe1));
        System.out.println(textMe);
        System.out.println("manual :" + textMe.hashCode());


        System.out.println("");
        TrueLove trueLove = new TrueLove("True Love", "Love", 2000);
        TrueLove trueLove1 = new TrueLove("True Love", "Love", 2000);
        System.out.println("both are same:"+trueLove.equals(trueLove1));
        System.out.println(trueLove);
        System.out.println("manual :" + trueLove.hashCode());


        System.out.println("");
        Trueheart trueheart = new Trueheart("True Heart", "Proposal", 2500);
        Trueheart trueheart1 = new Trueheart("True Heart", "Proposal", 2500);
        System.out.println("both are same:"+trueheart.equals(trueheart1));
        System.out.println(trueheart);
        System.out.println("manual :" + trueheart.hashCode());


        System.out.println("");
        WarmHug warmHug = new WarmHug("Warm Hug", "Modern", 850);
        WarmHug warmHug1 = new WarmHug("Warm Hug", "Modern", 850);
        System.out.println("both are same:"+warmHug.equals(warmHug1));
        System.out.println(warmHug);
        System.out.println("manual :" + warmHug.hashCode());


        System.out.println("");
        Withuh withuh = new Withuh("With Uh", "Emotional", 4000);
        Withuh withuh1 = new Withuh("With Uh", "Emotional", 4000);
        System.out.println("both are same:"+withuh.equals(withuh1));
        System.out.println(withuh);
        System.out.println("manual :" + withuh.hashCode());


        System.out.println("");
        YouandMe youandMe = new YouandMe("You and Me", "Connection", 700);
        YouandMe youandMe1 = new YouandMe("You and Me", "Connection", 700);
        System.out.println("both are same:"+youandMe.equals(youandMe1));
        System.out.println(youandMe);
        System.out.println("manual :" + youandMe.hashCode());


        System.out.println("");
        SweetVibe sweetVibe = new SweetVibe("Sweat Vibe", "Vibe", 400);
        SweetVibe sweetVibe1 = new SweetVibe("Sweat Vibe", "Vibe", 400);
        System.out.println("both are same:"+sweetVibe.equals(sweetVibe1));
        System.out.println(sweetVibe);
        System.out.println("manual :" + sweetVibe.hashCode());


        System.out.println("");
        HoldTight holdTight = new HoldTight("Hold Tight", "Ceremony", 650);
        HoldTight holdTight1 = new HoldTight("Hold Tight", "Ceremony", 650);
        System.out.println("both are same:"+holdTight.equals(holdTight1));
        System.out.println(holdTight);
        System.out.println("manual :" + holdTight.hashCode());


        System.out.println("");
        Runtoyou runtoyou = new Runtoyou("Run To You", "Fellowship", 400);
        Runtoyou runtoyou1 = new Runtoyou("Run To You", "Fellowship", 400);
        System.out.println("both are same:"+runtoyou.equals(runtoyou1));
        System.out.println(runtoyou);
        System.out.println("manual :" + runtoyou.hashCode());


        System.out.println("");
        Heart heart = new Heart("Heart", "Biological", 800);
        Heart heart1 = new Heart("Heart", "Biological", 800);
        System.out.println("both are same:"+heart.equals(heart1));
        System.out.println(heart);
        System.out.println("manual :" + heart.hashCode());


        System.out.println("");
        Heartless heartless = new Heartless("Heart Less", "Sad", 850);
        Heartless heartless1 = new Heartless("Heart Less", "Sad", 850);
        System.out.println("both are same:"+heartless.equals(heartless1));
        System.out.println(heartless);
        System.out.println("manual :" + heartless.hashCode());


        System.out.println("");
        HeartSong heartSong = new HeartSong("Heart Song", "Music", 1500);
        HeartSong heartSong1 = new HeartSong("Heart Song", "Music", 1500);
        System.out.println("both are same:"+heartSong.equals(heartSong1));
        System.out.println(heartSong);
        System.out.println("manual :" + heartSong.hashCode());


        System.out.println("");
        YouSaid youSaid = new YouSaid("You said", "Storytell", 700);
        YouSaid youSaid1 = new YouSaid("You said", "Storytell", 700);
        System.out.println("both are same:"+youSaid.equals(youSaid1));
        System.out.println(youSaid);
        System.out.println("manual :" + youSaid.hashCode());


        System.out.println("");
        WarmKiss warmKiss = new WarmKiss("Warm Kiss", "Kissing", 1200);
        WarmKiss warmKiss1 = new WarmKiss("Warm Kiss", "Kissing", 1200);
        System.out.println("both are same:"+warmKiss.equals(warmKiss1));
        System.out.println(warmKiss);
        System.out.println("manual :" + warmKiss.hashCode());


        System.out.println("");
        TwoHearts twoHearts = new TwoHearts("Two Hearts", "Connection", 800);
        TwoHearts twoHearts1 = new TwoHearts("Two Hearts", "Connection", 800);
        System.out.println("both are same:"+twoHearts.equals(twoHearts1));
        System.out.println(twoHearts);
        System.out.println("manual :" + twoHearts.hashCode());


        System.out.println("");
        ThisLove thisLove = new ThisLove("This Love", "Love", 800);
        ThisLove thisLove1 = new ThisLove("This Love", "Love", 800);
        System.out.println("both are same:"+thisLove.equals(thisLove1));
        System.out.println(thisLove);
        System.out.println("manual :" + thisLove.hashCode());


        System.out.println("");
        OnlyLove onlyLove = new OnlyLove("Only Love", "Love", 700);
        OnlyLove onlyLove1 = new OnlyLove("Only Love", "Love", 700);
        System.out.println("both are same:"+onlyLove.equals(onlyLove1));
        System.out.println(onlyLove);
        System.out.println("manual :" + onlyLove.hashCode());


        System.out.println("");
        Stiilmine stiilmine = new Stiilmine("Still Mine", "Endless", 5000);
        Stiilmine stiilmine1 = new Stiilmine("Still Mine", "Endless", 5000);
        System.out.println("both are same:"+stiilmine.equals(stiilmine1));
        System.out.println(stiilmine);
        System.out.println("manual :" + stiilmine.hashCode());


        System.out.println("");
        SoulTouch soulTouch = new SoulTouch("Soul Touch", "Souls", 500);
        SoulTouch soulTouch1 = new SoulTouch("Soul Touch", "Souls", 500);
        System.out.println("both are same:"+soulTouch.equals(soulTouch1));
        System.out.println(soulTouch);
        System.out.println("manual :" + soulTouch.hashCode());


        System.out.println("");
        Soul soul = new Soul("Soul", "Mannasu", 750);
        Soul soul1 = new Soul("Soul", "Mannasu", 750);
        System.out.println("both are same:"+soul.equals(soul1));
        System.out.println(soul);
        System.out.println("manual :" + soul.hashCode());


        System.out.println("");
        SoftTouch softTouch = new SoftTouch("Soft Touch", "Touchy", 400);
        SoftTouch softTouch1 = new SoftTouch("Soft Touch", "Touchy", 400);
        System.out.println("both are same:"+softTouch.equals(softTouch1));
        System.out.println(softTouch);
        System.out.println("manual :" + softTouch.hashCode());


        System.out.println("");
        Silentlove silentlove = new Silentlove("Silent Love", "Silent story", 850);
        Silentlove silentlove1 = new Silentlove("Silent Love", "Silent story", 850);
        System.out.println("both are same:"+silentlove.equals(silentlove1));
        System.out.println(silentlove);
        System.out.println("manual :" + silentlove.hashCode());


        System.out.println("");
        SecretLove secretLove = new SecretLove("Secret Heart", "Heartly", 900);
        SecretLove secretLove1 = new SecretLove("Secret Heart", "Heartly", 900);
        System.out.println("both are same:"+secretLove.equals(secretLove1));
        System.out.println(secretLove);
        System.out.println("manual :" + secretLove.hashCode());


        System.out.println("");
        Secret secret = new Secret("Secret", "Scary", 600);
        Secret secret1 = new Secret("Secret", "Scary", 600);
        System.out.println("both are same:"+secret.equals(secret1));
        System.out.println(secret);
        System.out.println("manual :" + secret.hashCode());


        System.out.println("");
        SayYes sayYes = new SayYes("Say Yes", "Fake Story", 200);
        SayYes sayYes1 = new SayYes("Say Yes", "Fake Story", 200);
        System.out.println("both are same:"+sayYes.equals(sayYes1));
        System.out.println(sayYes);
        System.out.println("manual :" + sayYes.hashCode());


        System.out.println("");
        OpenHeart openHeart = new OpenHeart("Open Heart", "Heartly", 900);
        OpenHeart openHeart1 = new OpenHeart("Open Heart", "Heartly", 900);
        System.out.println("both are same:"+openHeart.equals(openHeart1));
        System.out.println(openHeart);
        System.out.println("manual :" + openHeart.hashCode());


        System.out.println("");
        OneWord oneWord = new OneWord("Only Word", "Word", 950);
        OneWord oneWord1 = new OneWord("Only Word", "Word", 950);
        System.out.println("both are same:"+oneWord.equals(oneWord1));
        System.out.println(oneWord);
        System.out.println("manual :" + oneWord.hashCode());


        System.out.println("");
        Nowords nowords = new Nowords("No Words", "Wordless", 650);
        Nowords nowords1 = new Nowords("No Words", "Wordless", 650);
        System.out.println("both are same:"+nowords.equals(nowords1));
        System.out.println(nowords);
        System.out.println("manual :" + nowords.hashCode());


        System.out.println("");
        Newstart newstart = new Newstart("New Start", "Starting", 400);
        Newstart newstart1 = new Newstart("New Start", "Starting", 400);
        System.out.println("both are same:"+newstart.equals(newstart1));
        System.out.println(newstart);
        System.out.println("manual :" + newstart.hashCode());


        System.out.println("");
        MyCrush myCrush = new MyCrush("My Crush", "School Story", 400);
        MyCrush myCrush1 = new MyCrush("My Crush", "School Story", 400);
        System.out.println("both are same:"+myCrush.equals(myCrush1));
        System.out.println(myCrush);
        System.out.println("manual :" + myCrush.hashCode());


        System.out.println("");
        MyBoo myBoo = new MyBoo("My Boo", "Caring", 700);
        MyBoo myBoo1 = new MyBoo("My Boo", "Caring", 700);
        System.out.println("both are same:"+myBoo.equals(myBoo1));
        System.out.println(myBoo);
        System.out.println("manual :" + myBoo.hashCode());


        System.out.println("");
        MeAndYou meAndYou = new MeAndYou("Me and You", "Lovestory", 8000);
        MeAndYou meAndYou1 = new MeAndYou("Me and You", "Lovestory", 8000);
        System.out.println("both are same:"+meAndYou.equals(meAndYou1));
        System.out.println(meAndYou);
        System.out.println("manual :" + meAndYou.hashCode());


        System.out.println("");
        LoveWins loveWins = new LoveWins("Love Wins", "War", 500);
        LoveWins loveWins1 = new LoveWins("Love Wins", "War", 500);
        System.out.println("both are same:"+loveWins.equals(loveWins1));
        System.out.println(loveWins);
        System.out.println("manual :" + loveWins.hashCode());


        System.out.println("");
        LoveAgain loveAgain = new LoveAgain("Love Again", "Over Possessive", 600);
        LoveAgain loveAgain1 = new LoveAgain("Love Again", "Over Possessive", 600);
        System.out.println("both are same:"+loveAgain.equals(loveAgain1));
        System.out.println(loveAgain);
        System.out.println("manual :" + loveAgain.hashCode());


        System.out.println("");
        LostAndFound lostAndFound = new LostAndFound("Lost and Found", "Thrilling", 800);
        LostAndFound lostAndFound1 = new LostAndFound("Lost and Found", "Thrilling", 800);
        System.out.println("both are same:"+lostAndFound.equals(lostAndFound1));
        System.out.println(lostAndFound);
        System.out.println("manual :" + lostAndFound.hashCode());


        System.out.println("");
        Latelove latelove = new Latelove("Late Love", "Love Story", 300);
        Latelove latelove1 = new Latelove("Late Love", "Love Story", 300);
        System.out.println("both are same:"+latelove.equals(latelove1));
        System.out.println(latelove);
        System.out.println("manual :" + latelove.hashCode());

        System.out.println("");
        LastCall lastCall = new LastCall("Last Call", "Sad", 400);
        LastCall lastCall1 = new LastCall("Last Call", "Sad", 400);
        System.out.println("both are same:"+lastCall.equals(lastCall1));
        System.out.println(lastCall);
        System.out.println("manual :" + lastCall.hashCode());

        System.out.println("");
        HisVoice hisVoice = new HisVoice("His Voice", "Imaginination", 800);
        HisVoice hisVoice1 = new HisVoice("His Voice", "Imaginination", 800);
        System.out.println("both are same:"+hisVoice.equals(hisVoice1));
        System.out.println(hisVoice);
        System.out.println("manual :" + hisVoice.hashCode());

        System.out.println("");
        HisSmile hisSmile = new HisSmile("His Smile", "Imagine", 400);
        HisSmile hisSmile1 = new HisSmile("His Smile", "Imagine", 400);
        System.out.println("both are same:"+hisSmile.equals(hisSmile1));
        System.out.println(hisSmile);
        System.out.println("manual: " + hisSmile.hashcode());

        System.out.println("");
        HisEyes hisEyes = new HisEyes("His Eyes", "Care", 300);
        HisEyes hisEyes1 = new HisEyes("His Eyes", "Care", 300);
        System.out.println("both are same:"+hisEyes.equals(hisEyes1));
        System.out.println(hisEyes);
        System.out.println("manual :" + hisEyes.hashCode());

        System.out.println("");
        HerVoice herVoice = new HerVoice("Her Voice", "Imagine", 500);
        HerVoice herVoice1 = new HerVoice("Her Voice", "Imagine", 500);
        System.out.println("both are same:"+herVoice.equals(herVoice1));
        System.out.println(herVoice);
        System.out.println("manual :" + herVoice.hashCode());

        System.out.println("");
        HerTouch herTouch = new HerTouch("Her Touch", "Tempting", 7000);
        HerTouch herTouch1 = new HerTouch("Her Touch", "Tempting", 7000);
        System.out.println("both are same:"+herTouch.equals(herTouch1));
        System.out.println(herTouch);
        System.out.println("manual :" + herTouch.hashCode());

        System.out.println("");
        HerSmile herSmile = new HerSmile("Her Smile", "Attraction", 400);
        HerSmile herSmile1 = new HerSmile("Her Smile", "Attraction", 400);
        System.out.println("both are same:"+herSmile.equals(herSmile1));
        System.out.println(herSmile);
        System.out.println("manual :" + herSmile.hashCode());

        System.out.println("");
        HerEyes herEyes = new HerEyes("Her Eyes", "Distraction", 400);
        HerEyes herEyes1 = new HerEyes("Her Eyes", "Distraction", 400);
        System.out.println("both are same:"+herEyes.equals(herEyes1));
        System.out.println(herEyes);
        System.out.println("manual :" + herEyes.hashCode());

        System.out.println("");
        Founduh founduh = new Founduh("Found Uh", "Searching", 500);
        Founduh founduh1 = new Founduh("Found Uh", "Searching", 500);
        System.out.println("both are same:"+founduh.equals(founduh1));
        System.out.println(founduh);
        System.out.println("manual :" + founduh.hashCode());

        System.out.println("");
        ForYou forYou = new ForYou("For You", "Care", 900);
        ForYou forYou1 = new ForYou("For You", "Care", 900);
        System.out.println("both are same:"+forYou.equals(forYou1));
        System.out.println(forYou);
        System.out.println("manual :" + forYou.hashCode());

        System.out.println("");
        FirstSight firstSight = new FirstSight("First Sight", "Thrilling", 700);
        FirstSight firstSight1 = new FirstSight("First Sight", "Thrilling", 700);
        System.out.println("both are same:"+firstSight.equals(firstSight1));
        System.out.println(firstSight);
        System.out.println("manual :" + firstSight.hashCode());

        System.out.println("");
        DreamGirl dreamGirl = new DreamGirl("Dream Girl", "Dreaming", 500);
        DreamGirl dreamGirl1 = new DreamGirl("Dream Girl", "Dreaming", 500);
        System.out.println("both are same:"+dreamGirl.equals(dreamGirl1));
        System.out.println(dreamGirl);
        System.out.println("manual :" + dreamGirl.hashCode());

        System.out.println("");
        Dream dream = new Dream("Dream", "Dreaming", 500);
        Dream dream1 = new Dream("Dream", "Dreaming", 500);
        System.out.println("both are same:"+dream.equals(dream1));
        System.out.println(dream);
        System.out.println("manual :" + dream.hashCode());

        System.out.println("");
        DearYou dearYou = new DearYou("Dear You", "Horror", 400);
        DearYou dearYou1 = new DearYou("Dear You", "Horror", 400);
        System.out.println("both are same:"+dearYou.equals(dearYou1));
        System.out.println(dearYou);
        System.out.println("manual :" + dearYou.hashCode());

        System.out.println("");
        BlueEyes blueEyes = new BlueEyes("Blue Eyes", "Attractive", 600);
        BlueEyes blueEyes1 = new BlueEyes("Blue Eyes", "Attractive", 600);
        System.out.println("both are same:"+blueEyes.equals(blueEyes1));
        System.out.println(blueEyes);
        System.out.println("manual :" + blueEyes.hashCode());

        System.out.println("");
        Dearuh dearuh = new Dearuh("Dear Uh", "Missing", 300);
        Dearuh dearuh1 = new Dearuh("Dear Uh", "Missing", 300);
        System.out.println("both are same:"+dearuh.equals(dearuh1));
        System.out.println(dearuh);
        System.out.println("manual :" + dearuh.hashCode());

        System.out.println("");
        Allyours allyours = new Allyours("All Yours", "Love Story", 500);
        Allyours allyours1 = new Allyours("All Yours", "Love Story", 500);
        System.out.println("both are same:"+allyours.equals(allyours1));
        System.out.println(allyours);
        System.out.println("manual :" + allyours.hashCode());
    }

}