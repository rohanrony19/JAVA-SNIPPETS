package com.xworkz.interfaces.ruleRunner;

import com.xworkz.interfaces.rule.*;

public class Runner1 {
    public static void main(String[] args) {

        Home homeImpli=new HomeImpli();
        homeImpli.sleepEarly();
        homeImpli.speakLoud();
        homeImpli.slipperOutSide();
        homeImpli.place();
        System.out.println(" ");

        Bag bagImpli=new BagImpli();
        bagImpli.closeJip();
        bagImpli.size();
        bagImpli.keepSafe();
        bagImpli.need();
        System.out.println(" ");

        Airoplain airoplain = new AiroplainImpli();
        airoplain.fly();
        airoplain.land();
        airoplain.carryPassengers();
        airoplain.costly();
        System.out.println(" ");

        Drama drama = new DramaImpli();
        drama.act();
        drama.direct();
        drama.rehearse();
        drama.good();
        System.out.println(" ");

        Movie movie = new MovieImpli();
        movie.play();
        movie.pause();
        movie.stop();
        movie.watch();
        System.out.println(" ");

        Star star = new StarImpli();
        star.shine();
        star.twinkle();
        star.visibleAtNight();
        star.planet();
        System.out.println(" ");

        Sun sun = new SunImpli();
        sun.rise();
        sun.set();
        sun.giveLight();
        sun.bright();
        System.out.println(" ");

        Moon moon = new MoonImpli();
        moon.glow();
        moon.reflectSunlight();
        moon.appearAtNight();
        moon.light();
        System.out.println(" ");

        Rose rose = new RoseImpli();
        rose.smell();
        rose.bloom();
        rose.hasThorns();
        rose.flower();
        System.out.println(" ");

        Sunflower sunflower = new SunflowerImpli();
        sunflower.faceSun();
        sunflower.produceSeeds();
        sunflower.growTall();
        sunflower.flower();
        System.out.println(" ");

        Hospital hospital = new HospitalImpli();
        hospital.admitPatient();
        hospital.provideTreatment();
        hospital.dischargePatient();
        hospital.emergency();
        System.out.println(" ");

        School school = new SchoolImpli();
        school.conductClass();
        school.giveHomework();
        school.takeAttendance();
        school.place();
        System.out.println(" ");

        UniversityImpli university = new UniversityImpli();
        university.conductExam();
        university.publishResults();
        university.grantDegrees();
        university.place();
        System.out.println(" ");

        Teachers teachers = new TeachersImpli();
        teachers.teach();
        teachers.evaluate();
        teachers.guideStudents();
        teachers.strict();
        System.out.println(" ");

        Collage collage = new CollageImpli();
        collage.conductEvents();
        collage.provideHostel();
        collage.manageDepartments();
        collage.pesitm();
        System.out.println(" ");

        Watch watch = new WatchImpli();
        watch.showTime();
        watch.setAlarm();
        watch.waterproof();
        watch.time();
        System.out.println(" ");

        Gold gold = new GoldImpli();
        gold.shine();
        gold.isExpensive();
        gold.usedForJewellery();
        gold.rate();
        System.out.println(" ");

        Silver silver = new SilverImpli();
        silver.usedInUtensils();
        silver.polish();
        silver.reflectLight();
        silver.metal();
        System.out.println(" ");

        Platinum platinum = new PlatinumImpli();
        platinum.rareMetal();
        platinum.usedInRings();
        platinum.doesNotTarnish();
        platinum.metal();
        System.out.println(" ");

        Kid kid = new KidImpli();
        kid.play();
        kid.learn();
        kid.eat();
        kid.child();
        System.out.println(" ");

        Goa goa = new GoaImpli();
        goa.enjoyBeach();
        goa.party();
        goa.exploreChurches();
        goa.place();
        System.out.println(" ");

        People people = new PeopleImpli();
        people.talk();
        people.walk();
        people.help();
        people.dull();
        System.out.println(" ");

        Network network = new NetworkImpli();
        network.connect();
        network.transferData();
        network.disconnect();
        network.speed();
        System.out.println(" ");

        Country country = new CountryImpli();
        country.develop();
        country.maintainLaw();
        country.representCulture();
        country.india();
        System.out.println(" ");

        Pluto pluto = new PlutoImpli();
        pluto.revolve();
        pluto.rotate();
        pluto.hasIce();
        pluto.planet();
        System.out.println(" ");

        Saturn saturn = new SaturnImpli();
        saturn.rotate();
        saturn.hasRings();
        saturn.attractMoons();
        saturn.planet();
        System.out.println(" ");

        Mars mars = new MarsImpli();
        mars.isRedPlanet();
        mars.hasDustStorms();
        mars.hasMountains();
        mars.planet();
        System.out.println(" ");

        Alien alien = new AlienImpli();
        alien.comeFromSpace();
        alien.hasBigEyes();
        alien.communicate();
        alien.ugly();
        System.out.println(" ");

        Friend friend = new FriendImpli();
        friend.support();
        friend.share();
        friend.makeLaugh();
        friend.inNeed();
        System.out.println(" ");

        Speaker speaker = new SpeakerImpli();
        speaker.produceSound();
        speaker.connectBluetooth();
        speaker.increaseVolume();
        speaker.sound();
        System.out.println(" ");

        Carrot carrot = new CarrotImpli();
        carrot.isHealthy();
        carrot.usedInSalad();
        carrot.hasVitaminA();
        carrot.vegie();
        System.out.println(" ");

        Tomato tomato = new TomatoImpli();
        tomato.isRed();
        tomato.juicy();
        tomato.usedInCurry();
        tomato.vegetable();
        System.out.println(" ");

        Orange orange = new OrangeImpli();
        orange.isCitrus();
        orange.hasVitaminC();
        orange.isRound();
        orange.fruit();
        System.out.println(" ");

        Attendance attendance = new AttendanceImpli();
        attendance.markPresent();
        attendance.isLate();
        attendance.calculatePercentage();
        attendance.mandatory();
        System.out.println(" ");

        Battery battery = new BatteryImpli();
        battery.storePower();
        battery.discharge();
        battery.isRechargeable();
        battery.percentage();
        System.out.println(" ");

        Fan fan = new FanImpli();
        fan.rotate();
        fan.coolAir();
        fan.changeSpeed();
        fan.must();
        System.out.println(" ");

        Train train = new TrainImpli();
        train.run();
        train.stop();
        train.horn();
        train.big();
        System.out.println(" ");

        Engine engine = new EngineImpli();
        engine.start();
        engine.consumeFuel();
        engine.stop();
        engine.repair();
        System.out.println(" ");

        Doctor doctor = new DoctorImpli();
        doctor.diagnose();
        doctor.prescribe();
        doctor.performSurgery();
        doctor.human();
        System.out.println(" ");

        Laptop laptop = new LaptopImpli();
        laptop.powerOn();
        laptop.runPrograms();
        laptop.shutDown();
        laptop.charge();
        System.out.println(" ");

        Window window = new WindowImpli();
        window.open();
        window.close();
        window.allowAir();
        window.light();
        System.out.println(" ");

        Chair chair = new ChairImpli();
        chair.sitOn();
        chair.hasLegs();
        chair.isComfortable();
        chair.plastic();
        System.out.println(" ");

        Fridge fridge = new FridgeImpli();
        fridge.coolItems();
        fridge.storeFood();
        fridge.makeIce();
        fridge.things();
        System.out.println(" ");

        Bottle bottle = new BottleImpli();
        bottle.fill();
        bottle.pour();
        bottle.isReusable();
        bottle.water();
        System.out.println(" ");

        Vote vote = new VoteImpli();
        vote.castVote();
        vote.verifyVoter();
        vote.countVote();
        vote.right();
        System.out.println(" ");

        Bjp bjp = new BjpImpli();
        bjp.winElection();
        bjp.makeSpeech();
        bjp.launchScheme();
        bjp.party();
        System.out.println(" ");

        Modhi modhi = new ModhiImpli();
        modhi.leadCountry();
        modhi.speak();
        modhi.visitState();
        modhi.pm();
        System.out.println(" ");

        India india = new IndiaImpli();
        india.showCulture();
        india.celebrateFestival();
        india.growEconomy();
        india.country();
        System.out.println(" ");

        Money money = new MoneyImpli();
        money.spend();
        money.save();
        money.invest();
        money.must();
        System.out.println(" ");

        Current current = new CurrentImpli();
        current.flow();
        current.shock();
        current.lightUp();
        current.volt();
        System.out.println(" ");

        Dollar dollar = new DollarImpli();
        dollar.exchange();
        dollar.convert();
        dollar.value();
        dollar.money();
        System.out.println(" ");

        Chain chain = new ChainImpli();
        chain.lock();
        chain.wear();
        chain.shine();
        chain.dog();
        System.out.println(" ");

        Dog dog = new DogImpli();
        dog.bark();
        dog.run();
        dog.wagTail();
        dog.cute();
        System.out.println(" ");

        Barbie barbie = new BarbieImpli();
        barbie.dressUp();
        barbie.talk();
        barbie.play();
        barbie.fav();
        System.out.println(" ");

        Trolley trolley = new TrolleyImpli();
        trolley.roll();
        trolley.carry();
        trolley.store();
        trolley.hold();
        System.out.println(" ");

        Dead dead = new DeadImpli();
        dead.remember();
        dead.bury();
        dead.mourn();
        dead.body();
        System.out.println(" ");

        God god = new GodImpli();
        god.bless();
        god.forgive();
        god.guide();
        god.havePlan();
        System.out.println(" ");

        Temple temple = new TempleImpli();
        temple.openGate();
        temple.performPuja();
        temple.ringBell();
        temple.divine();
        System.out.println(" ");

        Shoe shoe = new ShoeImpli();
        shoe.wear();
        shoe.polish();
        shoe.walk();
        shoe.size();
        System.out.println(" ");

        Bet bet = new BetImpli();
        bet.place();
        bet.win();
        bet.lose();
        bet.notGood();
        System.out.println(" ");

        Bottom bottom = new BottomImpli();
        bottom.sitOn();
        bottom.balance();
        bottom.support();
        bottom.up();
        System.out.println(" ");

        Radio radio = new RadioImpli();
        radio.tune();
        radio.playMusic();
        radio.increaseVolume();
        radio.play();
        System.out.println(" ");

        TV tv = new TVImpli();
        tv.powerOn();
        tv.changeChannel();
        tv.increaseVolume();
        tv.watch();
        System.out.println(" ");

        Remote remote = new RemoteImpli();
        remote.pressButton();
        remote.connectDevice();
        remote.changeSetting();
        remote.press();
        System.out.println(" ");

        AC ac = new ACImpli();
        ac.coolRoom();
        ac.setTemperature();
        ac.swing();
        ac.costly();
        System.out.println(" ");

        Hotspot hotspot = new HotspotImpli();
        hotspot.turnOn();
        hotspot.connectDevice();
        hotspot.turnOff();
        hotspot.connect();
        System.out.println(" ");

        Bluetooth bluetooth = new BluetoothImpli();
        bluetooth.pairDevice();
        bluetooth.sendFile();
        bluetooth.unpair();
        bluetooth.connect();
        System.out.println(" ");

        Connect connect = new ConnectImpli();
        connect.establish();
        connect.maintain();
        connect.terminate();
        connect.people();
        System.out.println(" ");

        Leave leave = new LeaveImpli();
        leave.apply();
        leave.approve();
        leave.reject();
        leave.take();
        System.out.println(" ");

        Library library = new LibraryImpli();
        library.open();
        library.issueBook();
        library.close();
        library.good();
        System.out.println(" ");

        Trunk trunk = new TrunkImpli();
        trunk.open();
        trunk.putItems();
        trunk.close();
        trunk.elephant();
        System.out.println(" ");

        Truck truck = new TruckImpli();
        truck.load();
        truck.transport();
        truck.unload();
        truck.carry();
        System.out.println(" ");

        Bike bike = new BikeImpli();
        bike.start();
        bike.ride();
        bike.stop();
        bike.wheel();
        System.out.println(" ");

        Petrol petrol = new PetrolImpli();
        petrol.fill();
        petrol.burn();
        petrol.checkLevel();
        petrol.money();
        System.out.println(" ");

        Water water = new WaterImpli();
        water.drink();
        water.boil();
        water.flow();
        water.cost();
        System.out.println(" ");

        Lotion lotion = new LotionImpli();
        lotion.apply();
        lotion.protectSkin();
        lotion.moisturize();
        lotion.a();
        System.out.println(" ");

        Ponds ponds = new PondsImpli();
        ponds.smoothSkin();
        ponds.glow();
        ponds.freshFeel();
        ponds.cream();
        System.out.println(" ");

        HM hm = new HMImpli();
        hm.design();
        hm.trend();
        hm.sell();
        hm.brand();
        System.out.println(" ");

    }
}
