package com.xworkz.interfaces.ruleRunner;

import com.xworkz.interfaces.rule.*;

public class Runner1 {
    public static void main(String[] args) {
        Home homeImpli=new HomeImpli();
        homeImpli.sleepEarly();
        homeImpli.speakLoud();
        homeImpli.slipperOutSide();
        homeImpli.place();

        Bag bagImpli=new BagImpli();
        bagImpli.closeJip();
        bagImpli.size();
        bagImpli.keepSafe();
        bagImpli.need();

        Airoplain airoplain = new AiroplainImpli();
        airoplain.fly();
        airoplain.land();
        airoplain.carryPassengers();
        airoplain.costly();

        Drama drama = new DramaImpli();
        drama.act();
        drama.direct();
        drama.rehearse();
        drama.good();

        Movie movie = new MovieImpli();
        movie.play();
        movie.pause();
        movie.stop();
        movie.watch();

        Star star = new StarImpli();
        star.shine();
        star.twinkle();
        star.visibleAtNight();
        star.planet();

        Sun sun = new SunImpli();
        sun.rise();
        sun.set();
        sun.giveLight();
        sun.bright();

        Moon moon = new MoonImpli();
        moon.glow();
        moon.reflectSunlight();
        moon.appearAtNight();
        moon.light();

        Rose rose = new RoseImpli();
        rose.smell();
        rose.bloom();
        rose.hasThorns();
        rose.flower();

        Sunflower sunflower = new SunflowerImpli();
        sunflower.faceSun();
        sunflower.produceSeeds();
        sunflower.growTall();
        sunflower.flower();

        Hospital hospital = new HospitalImpli();
        hospital.admitPatient();
        hospital.provideTreatment();
        hospital.dischargePatient();
        hospital.emergency();

        School school = new SchoolImpli();
        school.conductClass();
        school.giveHomework();
        school.takeAttendance();
        school.place();

        UniversityImpli university = new UniversityImpli();
        university.conductExam();
        university.publishResults();
        university.grantDegrees();
        university.place();

        Teachers teachers = new TeachersImpli();
        teachers.teach();
        teachers.evaluate();
        teachers.guideStudents();
        teachers.strict();

        Collage collage = new CollageImpli();
        collage.conductEvents();
        collage.provideHostel();
        collage.manageDepartments();
        collage.pesitm();

        Watch watch = new WatchImpli();
        watch.showTime();
        watch.setAlarm();
        watch.waterproof();
        watch.time();

        Gold gold = new GoldImpli();
        gold.shine();
        gold.isExpensive();
        gold.usedForJewellery();
        gold.rate();

        Silver silver = new SilverImpli();
        silver.usedInUtensils();
        silver.polish();
        silver.reflectLight();
        silver.metal();

        Platinum platinum = new PlatinumImpli();
        platinum.rareMetal();
        platinum.usedInRings();
        platinum.doesNotTarnish();
        platinum.metal();

        Kid kid = new KidImpli();
        kid.play();
        kid.learn();
        kid.eat();
        kid.child();

        Goa goa = new GoaImpli();
        goa.enjoyBeach();
        goa.party();
        goa.exploreChurches();
        goa.place();

        People people = new PeopleImpli();
        people.talk();
        people.walk();
        people.help();
        people.dull();

        Network network = new NetworkImpli();
        network.connect();
        network.transferData();
        network.disconnect();
        network.speed();

        Country country = new CountryImpli();
        country.develop();
        country.maintainLaw();
        country.representCulture();
        country.india();

        Pluto pluto = new PlutoImpli();
        pluto.revolve();
        pluto.rotate();
        pluto.hasIce();
        pluto.planet();

        Saturn saturn = new SaturnImpli();
        saturn.rotate();
        saturn.hasRings();
        saturn.attractMoons();
        saturn.planet();

        Mars mars = new MarsImpli();
        mars.isRedPlanet();
        mars.hasDustStorms();
        mars.hasMountains();
        mars.planet();

        Alien alien = new AlienImpli();
        alien.comeFromSpace();
        alien.hasBigEyes();
        alien.communicate();
        alien.ugly();

        Friend friend = new FriendImpli();
        friend.support();
        friend.share();
        friend.makeLaugh();
        friend.inNeed();

        Speaker speaker = new SpeakerImpli();
        speaker.produceSound();
        speaker.connectBluetooth();
        speaker.increaseVolume();
        speaker.sound();

        Carrot carrot = new CarrotImpli();
        carrot.isHealthy();
        carrot.usedInSalad();
        carrot.hasVitaminA();
        carrot.vegie();

        Tomato tomato = new TomatoImpli();
        tomato.isRed();
        tomato.juicy();
        tomato.usedInCurry();
        tomato.vegetable();

        Orange orange = new OrangeImpli();
        orange.isCitrus();
        orange.hasVitaminC();
        orange.isRound();
        orange.fruit();

        Attendance attendance = new AttendanceImpli();
        attendance.markPresent();
        attendance.isLate();
        attendance.calculatePercentage();
        attendance.mandatory();

        Battery battery = new BatteryImpli();
        battery.storePower();
        battery.discharge();
        battery.isRechargeable();
        battery.percentage();

        Fan fan = new FanImpli();
        fan.rotate();
        fan.coolAir();
        fan.changeSpeed();
        fan.must();

        Train train = new TrainImpli();
        train.run();
        train.stop();
        train.horn();
        train.big();

        Engine engine = new EngineImpli();
        engine.start();
        engine.consumeFuel();
        engine.stop();
        engine.repair();

        Doctor doctor = new DoctorImpli();
        doctor.diagnose();
        doctor.prescribe();
        doctor.performSurgery();
        doctor.human();

        Laptop laptop = new LaptopImpli();
        laptop.powerOn();
        laptop.runPrograms();
        laptop.shutDown();
        laptop.charge();

        Window window = new WindowImpli();
        window.open();
        window.close();
        window.allowAir();
        window.light();

        Chair chair = new ChairImpli();
        chair.sitOn();
        chair.hasLegs();
        chair.isComfortable();
        chair.plastic();

        Fridge fridge = new FridgeImpli();
        fridge.coolItems();
        fridge.storeFood();
        fridge.makeIce();
        fridge.things();

        Bottle bottle = new BottleImpli();
        bottle.fill();
        bottle.pour();
        bottle.isReusable();
        bottle.water();

        Vote vote = new VoteImpli();
        vote.castVote();
        vote.verifyVoter();
        vote.countVote();
        vote.right();

        Bjp bjp = new BjpImpli();
        bjp.winElection();
        bjp.makeSpeech();
        bjp.launchScheme();
        bjp.party();

        Modhi modhi = new ModhiImpli();
        modhi.leadCountry();
        modhi.speak();
        modhi.visitState();
        modhi.pm();

        India india = new IndiaImpli();
        india.showCulture();
        india.celebrateFestival();
        india.growEconomy();
        india.country();

        Money money = new MoneyImpli();
        money.spend();
        money.save();
        money.invest();
        money.must();

        Current current = new CurrentImpli();
        current.flow();
        current.shock();
        current.lightUp();
        current.volt();

        Dollar dollar = new DollarImpli();
        dollar.exchange();
        dollar.convert();
        dollar.value();
        dollar.money();

        Chain chain = new ChainImpli();
        chain.lock();
        chain.wear();
        chain.shine();
        chain.dog();

        Dog dog = new DogImpli();
        dog.bark();
        dog.run();
        dog.wagTail();
        dog.cute();

        Barbie barbie = new BarbieImpli();
        barbie.dressUp();
        barbie.talk();
        barbie.play();
        barbie.fav();

        Trolley trolley = new TrolleyImpli();
        trolley.roll();
        trolley.carry();
        trolley.store();
        trolley.hold();

        Dead dead = new DeadImpli();
        dead.remember();
        dead.bury();
        dead.mourn();
        dead.body();

        God god = new GodImpli();
        god.bless();
        god.forgive();
        god.guide();
        god.havePlan();

        Temple temple = new TempleImpli();
        temple.openGate();
        temple.performPuja();
        temple.ringBell();
        temple.divine();

        Shoe shoe = new ShoeImpli();
        shoe.wear();
        shoe.polish();
        shoe.walk();
        shoe.size();

        Bet bet = new BetImpli();
        bet.place();
        bet.win();
        bet.lose();
        bet.notGood();

        Bottom bottom = new BottomImpli();
        bottom.sitOn();
        bottom.balance();
        bottom.support();
        bottom.up();

        Radio radio = new RadioImpli();
        radio.tune();
        radio.playMusic();
        radio.increaseVolume();
        radio.play();

        TV tv = new TVImpli();
        tv.powerOn();
        tv.changeChannel();
        tv.increaseVolume();
        tv.watch();

        Remote remote = new RemoteImpli();
        remote.pressButton();
        remote.connectDevice();
        remote.changeSetting();
        remote.press();

        AC ac = new ACImpli();
        ac.coolRoom();
        ac.setTemperature();
        ac.swing();
        ac.costly();

        Hotspot hotspot = new HotspotImpli();
        hotspot.turnOn();
        hotspot.connectDevice();
        hotspot.turnOff();
        hotspot.connect();

        Bluetooth bluetooth = new BluetoothImpli();
        bluetooth.pairDevice();
        bluetooth.sendFile();
        bluetooth.unpair();
        bluetooth.connect();

        Connect connect = new ConnectImpli();
        connect.establish();
        connect.maintain();
        connect.terminate();
        connect.people();

        Leave leave = new LeaveImpli();
        leave.apply();
        leave.approve();
        leave.reject();
        leave.take();

        Library library = new LibraryImpli();
        library.open();
        library.issueBook();
        library.close();
        library.good();

        Trunk trunk = new TrunkImpli();
        trunk.open();
        trunk.putItems();
        trunk.close();
        trunk.elephant();

        Truck truck = new TruckImpli();
        truck.load();
        truck.transport();
        truck.unload();
        truck.carry();

        Bike bike = new BikeImpli();
        bike.start();
        bike.ride();
        bike.stop();
        bike.wheel();

        Petrol petrol = new PetrolImpli();
        petrol.fill();
        petrol.burn();
        petrol.checkLevel();
        petrol.money();

        Water water = new WaterImpli();
        water.drink();
        water.boil();
        water.flow();
        water.cost();

        Lotion lotion = new LotionImpli();
        lotion.apply();
        lotion.protectSkin();
        lotion.moisturize();
        lotion.a();

        Ponds ponds = new PondsImpli();
        ponds.smoothSkin();
        ponds.glow();
        ponds.freshFeel();
        ponds.cream();

        HM hm = new HMImpli();
        hm.design();
        hm.trend();
        hm.sell();
        hm.brand();

    }
}
