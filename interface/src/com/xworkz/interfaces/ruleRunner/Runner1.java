package com.xworkz.interfaces.ruleRunner;

import com.xworkz.interfaces.rule.*;

public class Runner1 {
    public static void main(String[] args) {
        Home homeImpli=new HomeImpli();
        homeImpli.sleepEarly();
        homeImpli.speakLoud();
        homeImpli.slipperOutSide();

        Bag bagImpli=new BagImpli();
        bagImpli.closeJip();
        bagImpli.size();
        bagImpli.keepSafe();

        Airoplain airoplain = new AiroplainImpli();
        airoplain.fly();
        airoplain.land();
        airoplain.carryPassengers();

        Drama drama = new DramaImpli();
        drama.act();
        drama.direct();
        drama.rehearse();

        Movie movie = new MovieImpli();
        movie.play();
        movie.pause();
        movie.stop();

        Star star = new StarImpli();
        star.shine();
        star.twinkle();
        star.visibleAtNight();

        Sun sun = new SunImpli();
        sun.rise();
        sun.set();
        sun.giveLight();

        Moon moon = new MoonImpli();
        moon.glow();
        moon.reflectSunlight();
        moon.appearAtNight();

        Rose rose = new RoseImpli();
        rose.smell();
        rose.bloom();
        rose.hasThorns();

        Sunflower sunflower = new SunflowerImpli();
        sunflower.faceSun();
        sunflower.produceSeeds();
        sunflower.growTall();

        Hospital hospital = new HospitalImpli();
        hospital.admitPatient();
        hospital.provideTreatment();
        hospital.dischargePatient();

        School school = new SchoolImpli();
        school.conductClass();
        school.giveHomework();
        school.takeAttendance();

        UniversityImpli university = new UniversityImpli();
        university.conductExam();
        university.publishResults();
        university.grantDegrees();

        Teachers teachers = new TeachersImpli();
        teachers.teach();
        teachers.evaluate();
        teachers.guideStudents();

        Collage collage = new CollageImpli();
        collage.conductEvents();
        collage.provideHostel();
        collage.manageDepartments();

        Watch watch = new WatchImpli();
        watch.showTime();
        watch.setAlarm();
        watch.waterproof();

        Gold gold = new GoldImpli();
        gold.shine();
        gold.isExpensive();
        gold.usedForJewellery();

        Silver silver = new SilverImpli();
        silver.usedInUtensils();
        silver.polish();
        silver.reflectLight();

        Platinum platinum = new PlatinumImpli();
        platinum.rareMetal();
        platinum.usedInRings();
        platinum.doesNotTarnish();

        Kid kid = new KidImpli();
        kid.play();
        kid.learn();
        kid.eat();

        Goa goa = new GoaImpli();
        goa.enjoyBeach();
        goa.party();
        goa.exploreChurches();

        People people = new PeopleImpli();
        people.talk();
        people.walk();
        people.help();

        Network network = new NetworkImpli();
        network.connect();
        network.transferData();
        network.disconnect();

        Country country = new CountryImpli();
        country.develop();
        country.maintainLaw();
        country.representCulture();

        Pluto pluto = new PlutoImpli();
        pluto.revolve();
        pluto.rotate();
        pluto.hasIce();

        Saturn saturn = new SaturnImpli();
        saturn.rotate();
        saturn.hasRings();
        saturn.attractMoons();

        Mars mars = new MarsImpli();
        mars.isRedPlanet();
        mars.hasDustStorms();
        mars.hasMountains();

        Alien alien = new AlienImpli();
        alien.comeFromSpace();
        alien.hasBigEyes();
        alien.communicate();

        Friend friend = new FriendImpli();
        friend.support();
        friend.share();
        friend.makeLaugh();

        Speaker speaker = new SpeakerImpli();
        speaker.produceSound();
        speaker.connectBluetooth();
        speaker.increaseVolume();

        Carrot carrot = new CarrotImpli();
        carrot.isHealthy();
        carrot.usedInSalad();
        carrot.hasVitaminA();

        Tomato tomato = new TomatoImpli();
        tomato.isRed();
        tomato.juicy();
        tomato.usedInCurry();

        Orange orange = new OrangeImpli();
        orange.isCitrus();
        orange.hasVitaminC();
        orange.isRound();

        Attendance attendance = new AttendanceImpli();
        attendance.markPresent();
        attendance.isLate();
        attendance.calculatePercentage();

        Battery battery = new BatteryImpli();
        battery.storePower();
        battery.discharge();
        battery.isRechargeable();

        Fan fan = new FanImpli();
        fan.rotate();
        fan.coolAir();
        fan.changeSpeed();

        Train train = new TrainImpli();
        train.run();
        train.stop();
        train.horn();

        Engine engine = new EngineImpli();
        engine.start();
        engine.consumeFuel();
        engine.stop();

        Doctor doctor = new DoctorImpli();
        doctor.diagnose();
        doctor.prescribe();
        doctor.performSurgery();

        Laptop laptop = new LaptopImpli();
        laptop.powerOn();
        laptop.runPrograms();
        laptop.shutDown();

        Window window = new WindowImpli();
        window.open();
        window.close();
        window.allowAir();

        Chair chair = new ChairImpli();
        chair.sitOn();
        chair.hasLegs();
        chair.isComfortable();

        Fridge fridge = new FridgeImpli();
        fridge.coolItems();
        fridge.storeFood();
        fridge.makeIce();

        Bottle bottle = new BottleImpli();
        bottle.fill();
        bottle.pour();
        bottle.isReusable();

        Vote vote = new VoteImpli();
        vote.castVote();
        vote.verifyVoter();
        vote.countVote();

        Bjp bjp = new BjpImpli();
        bjp.winElection();
        bjp.makeSpeech();
        bjp.launchScheme();

        Modhi modhi = new ModhiImpli();
        modhi.leadCountry();
        modhi.speak();
        modhi.visitState();

        India india = new IndiaImpli();
        india.showCulture();
        india.celebrateFestival();
        india.growEconomy();

        Money money = new MoneyImpli();
        money.spend();
        money.save();
        money.invest();

        Current current = new CurrentImpli();
        current.flow();
        current.shock();
        current.lightUp();

        Dollar dollar = new DollarImpli();
        dollar.exchange();
        dollar.convert();
        dollar.value();

        Chain chain = new ChainImpli();
        chain.lock();
        chain.wear();
        chain.shine();

        Dog dog = new DogImpli();
        dog.bark();
        dog.run();
        dog.wagTail();

        Barbie barbie = new BarbieImpli();
        barbie.dressUp();
        barbie.talk();
        barbie.play();

        Trolley trolley = new TrolleyImpli();
        trolley.roll();
        trolley.carry();
        trolley.store();

        Dead dead = new DeadImpli();
        dead.remember();
        dead.bury();
        dead.mourn();

        God god = new GodImpli();
        god.bless();
        god.forgive();
        god.guide();

        Temple temple = new TempleImpli();
        temple.openGate();
        temple.performPuja();
        temple.ringBell();

        Shoe shoe = new ShoeImpli();
        shoe.wear();
        shoe.polish();
        shoe.walk();

        Bet bet = new BetImpli();
        bet.place();
        bet.win();
        bet.lose();

        Bottom bottom = new BottomImpli();
        bottom.sitOn();
        bottom.balance();
        bottom.support();

        Radio radio = new RadioImpli();
        radio.tune();
        radio.playMusic();
        radio.increaseVolume();

        TV tv = new TVImpli();
        tv.powerOn();
        tv.changeChannel();
        tv.increaseVolume();

        Remote remote = new RemoteImpli();
        remote.pressButton();
        remote.connectDevice();
        remote.changeSetting();

        AC ac = new ACImpli();
        ac.coolRoom();
        ac.setTemperature();
        ac.swing();

        Hotspot hotspot = new HotspotImpli();
        hotspot.turnOn();
        hotspot.connectDevice();
        hotspot.turnOff();

        Bluetooth bluetooth = new BluetoothImpli();
        bluetooth.pairDevice();
        bluetooth.sendFile();
        bluetooth.unpair();

        Connect connect = new ConnectImpli();
        connect.establish();
        connect.maintain();
        connect.terminate();

        Leave leave = new LeaveImpli();
        leave.apply();
        leave.approve();
        leave.reject();

        Library library = new LibraryImpli();
        library.open();
        library.issueBook();
        library.close();

        Trunk trunk = new TrunkImpli();
        trunk.open();
        trunk.putItems();
        trunk.close();

        Truck truck = new TruckImpli();
        truck.load();
        truck.transport();
        truck.unload();

        Bike bike = new BikeImpli();
        bike.start();
        bike.ride();
        bike.stop();

        Petrol petrol = new PetrolImpli();
        petrol.fill();
        petrol.burn();
        petrol.checkLevel();

        Water water = new WaterImpli();
        water.drink();
        water.boil();
        water.flow();

        Lotion lotion = new LotionImpli();
        lotion.apply();
        lotion.protectSkin();
        lotion.moisturize();

        Ponds ponds = new PondsImpli();
        ponds.smoothSkin();
        ponds.glow();
        ponds.freshFeel();

        HM hm = new HMImpli();
        hm.design();
        hm.trend();
        hm.sell();


    }
}
