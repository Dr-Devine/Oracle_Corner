package com.example.oracle.components;
import com.example.oracle.models.Tarot;
import com.example.oracle.repositories.TarotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    TarotRepository tarotRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {


        Tarot swords5 = new Tarot("Five of Swords",5,
                "Degradation, destruction, revocation, infamy, dishonour, loss, with the variants and analogues of these.","Swords",
                "A disdainful man looks after two retreating and dejected figures. Their swords lie upon the ground. He carries two others on his left shoulder, and a third sword is in his right hand, point to earth. He is the master in possession of the field.");
        tarotRepository.save(swords5);

        Tarot sw4 = new Tarot("Four or Swords",
                4,
                "Vigilance, retreat, solitude, hermit's repose, exile, tomb and coffin. It is these last that have suggested the design.",
                "Swords",
                "The effigy of a knight in the attitude of prayer, at full length upon his tomb");
        tarotRepository.save(sw4);

        Tarot wd5 = new Tarot("Five of Wands",
                5,
                "Imitation, as, for example, sham fight, but also the strenuous competition and struggle of the search after riches and fortune. In this sense it connects with the battle of life. Hence some attributions say that it is a card of gold, gain, opulence.",
                "Wands",
                "A posse of youths, who are brandishing staves, as if in sport or strife. It is mimic warfare");
        tarotRepository.save(wd5);

        Tarot cups6 = new Tarot("Six of Cups",
                6,
                "A card of the past and of memories. Looking back on childhood, happiness, enjoyment, but coming rather from the past. Things that have vanished.",
                "Cups",
                "Children in an old garden, their cups filled with flowers");
        tarotRepository.save(cups6);

        Tarot lovers = new Tarot("The Lovers",
                6,
                "Attraction, love, beauty, trials overcome.",
                "Major",
                "In the foreground are two human figures, male and female, unveiled before each other, as if Adam and Eve when they first occupied the paradise of the earthly body.");
        tarotRepository.save(lovers);

        Tarot cups10 = new Tarot("Ten of Cups",
                10,
                "Contentment, repose of the entire heart. The perfection of that state. Also perfection of human love and friendship.",
                "Cups",
                "Appearance of Cups in a rainbow. It is contemplated in wonder and ecstasy by a man and woman below, evidently husband and wife.");
        tarotRepository.save(cups10);

    }


}


