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

        Tarot fool = new Tarot(
                "The Fool",
                0,
                "Folly, mania, extravagance, intoxication, delirium, frenzy.",
                "Major",
                "A young man in gorgeous vestments pauses at the brink of a precipice among the great heights of the world",
                "http://www.learntarot.com/bigjpgs/maj00.jpg");
        tarotRepository.save(fool);

        Tarot magician = new Tarot(
                "The Magician",
                1,
                "Skill, diplomacy, address, subtlety; sickness, pain, loss, disaster, snares of enemies",
                "Major",
                "Skill, diplomacy, address, subtlety; sickness, pain, loss, disaster, snares of enemies",
                "http://www.learntarot.com/bigjpgs/maj01.jpg");
        tarotRepository.save(magician);

        Tarot highPriestess = new Tarot(
                "The High Priestess",
                2,
                "Secrets, mystery, the future as yet unrevealed; the woman who interests the Querent",
                "Major",
                "She has the lunar crescent at her feet, a horned diadem on her head, with a globe in the middle place, and a large solar cross on her breast.",
                "http://www.learntarot.com/bigjpgs/maj02.jpg");
        tarotRepository.save(highPriestess);

        Tarot empress = new Tarot(
                "The Empress",
                3,
                "Fruitfulness, action, initiative, length of days",
                "Major",
                "A stately figure, seated, having rich vestments and royal aspect, as of a daughter of heaven and earth",
                "http://www.learntarot.com/bigjpgs/maj03.jpg");
        tarotRepository.save(empress);

        Tarot emperor = new Tarot(
                "The Emperor",
                4,
                "Stability, power, protection, realization; a great person; aid, reason, conviction; also authority and will.",
                "Major",
                "Stability, power, protection, realization; a great person; aid, reason, conviction; also authority and will.",
                "http://www.learntarot.com/bigjpgs/maj04.jpg");
        tarotRepository.save(emperor);

        Tarot hierophant = new Tarot(
                "The Hierophant",
                5,
                "Marriage, alliance, captivity, servitude; by another account, mercy and goodness",
                "Major",
                "Marriage, alliance, captivity, servitude; by another account, mercy and goodness",
                "http://www.learntarot.com/bigjpgs/maj05.jpg");
        tarotRepository.save(hierophant);

        Tarot lovers = new Tarot(
                "The Lovers",
                6,
                "Attraction, love, beauty, trials overcome.",
                "Major",
                "In the foreground are two human figures, male and female, unveiled before each other, as if Adam and Eve when they first occupied the paradise of the earthly body.",
                "http://www.learntarot.com/bigjpgs/maj06.jpg");
        tarotRepository.save(lovers);

        Tarot chariot = new Tarot(
                "The Chariot",
                7,
                "Succour, providence also war, triumph, presumption, vengeance, trouble.",
                "Major",
                "A man in a chariot being drawn by 2 beasts",
                "http://www.learntarot.com/bigjpgs/maj07.jpg");
        tarotRepository.save(chariot);

        Tarot strength = new Tarot(
                "Strength",
                8,
                "Power, energy, action, courage, magnanimity; also complete success and honours.",
                "Major",
                "A woman effortlessly and with no fear, holding open the the mouth of a lion.",
                "http://www.learntarot.com/bigjpgs/maj08.jpg");
        tarotRepository.save(strength);

        Tarot hermit = new Tarot(
                "The Hermit",
                9,
                "Prudence, circumspection; also and especially treason, dissimulation, roguery, corruption.",
                "Major",
                "A solitary figure stands holding a lap to light their way",
                "http://www.learntarot.com/bigjpgs/maj09.jpg");
        tarotRepository.save(hermit);

        Tarot wheelOfFortune = new Tarot(
                "The Wheel of Fortune",
                10,
                "Destiny, fortune, success, elevation, luck, felicity.",
                "Major",
                "A wheel that symbolises the rise and fall or fate and fortune",
                "http://www.learntarot.com/bigjpgs/maj10.jpg");
        tarotRepository.save(wheelOfFortune);

        Tarot justice = new Tarot(
                "Justice",
                11,
                "Equity, rightness, probity, executive; triumph of the deserving side in law.",
                "Major",
                "A seated figure holding the scales of all that is just and fair",
                "http://www.learntarot.com/bigjpgs/maj11.jpg");
        tarotRepository.save(justice);

        Tarot hangedMan = new Tarot(
                "The Hanged Man",
                12,
                "Wisdom, circumspection, discernment, trials, sacrifice, intuition, divination, prophecy.",
                "Major",
                "A man hangs upside down by his leg",
                "http://www.learntarot.com/bigjpgs/maj12.jpg");
        tarotRepository.save(hangedMan);

        Tarot death = new Tarot(
                "Death",
                13,
                "End, mortality, destruction, corruption also, for a man, the loss of a benefactor for a woman, many contrarieties; for a maid, failure of marriage projects.",
                "Major",
                "The figure of Death itself holding a scythe",
                "http://www.learntarot.com/bigjpgs/maj13.jpg");
        tarotRepository.save(death);

        Tarot temperance = new Tarot(
                "Temperance",
                14,
                "Economy, moderation, frugality, management, accommodation.",
                "Major",
                "A winged angel, with the sign of the sun upon his forehead and on his breast the square and triangle of the septenary.",
                "http://www.learntarot.com/bigjpgs/maj14.jpg");
        tarotRepository.save(temperance);

        Tarot devil = new Tarot(
                "The Devil",
                15,
                "Ravage, violence, vehemence, extraordinary efforts, force, fatality; that which is predestined but is not for this reason evil.",
                "Major",
                "The Devil stands tall before a man and woman. Both enslaved by the comforts he offers whilst having everything it takes to break free",
                "http://www.learntarot.com/bigjpgs/maj15.jpg");
        tarotRepository.save(devil);

        Tarot tower = new Tarot(
                "The Tower",
                16,
                "Misery, distress, indigence, adversity, calamity, disgrace, deception, ruin. It is a card in particular of unforeseen catastrophe.",
                "Major",
                "A tower being destoyed by a storm and by the sea. It's occupants thrown by the winds to fall to their deaths... lol",
                "http://www.learntarot.com/bigjpgs/maj16.jpg");
        tarotRepository.save(tower);

        Tarot star = new Tarot(
                "The Star",
                17,
                "",
                "Major",
                "A great, radiant star of eight rays, surrounded by seven lesser stars--also of eight rays.",
                "http://www.learntarot.com/bigjpgs/maj17.jpg");
        tarotRepository.save(star);

        Tarot moon = new Tarot(
                "The Moon",
                18,
                "Hidden enemies, danger, calumny, darkness, terror, deception, occult forces, error.",
                "Major",
                "A cresent moon rises into the sky covering the night in its celestial light",
                "http://www.learntarot.com/bigjpgs/maj18.jpg");
        tarotRepository.save(moon);

        Tarot sun = new Tarot(
                "The Sun",
                19,
                "Material happiness, fortunate marriage, contentment.",
                "Major",
                "A child atop a horse with a red standard",
                "http://www.learntarot.com/bigjpgs/maj19.jpg");
        tarotRepository.save(sun);

        Tarot judgment = new Tarot(
                "The last Judgement",
                20,
                "Change of position, renewal, outcome. Another account specifies total loss though lawsuit.",
                "Major",
                "An arch angel heralds the souls of the dead from coffins",
                "http://www.learntarot.com/bigjpgs/maj20.jpg");
        tarotRepository.save(judgment);

        Tarot world = new Tarot(
                "The World",
                21,
                "Assured success, recompense, voyage, route, emigration, flight, change of place.",
                "Major",
                "A naked woman wrapped in a purple cloth, dancing inside a large laurel wreath.",
                "http://www.learntarot.com/bigjpgs/maj21.jpg"
        );
        tarotRepository.save(world);

        Tarot sword01 = new Tarot(
                "The Ace of Swords",
                1,
                "Triumph, the excessive degree in everything, conquest, triumph of force. It is a card of great force, in love as well as in hatred.",
                "Swords",
                "A hand issues from a cloud, grasping as word, the point of which is encircled by a crown.",
                "http://www.learntarot.com/bigjpgs/swords01.jpg");
        tarotRepository.save(sword01);

        Tarot swords05 = new Tarot(
                "Five of Swords",
                5,
                "Degradation, destruction, revocation, infamy, dishonour, loss, with the variants and analogues of these.",
                "Swords",
                "A disdainful man looks after two retreating and dejected figures. Their swords lie upon the ground. He carries two others on his left shoulder, and a third sword is in his right hand, point to earth. He is the master in possession of the field.",
                "http://www.learntarot.com/bigjpgs/swords05.jpg");
        tarotRepository.save(swords05);

        Tarot swords04 = new Tarot(
                "Four or Swords",
                4,
                "Vigilance, retreat, solitude, hermit's repose, exile, tomb and coffin. It is these last that have suggested the design.",
                "Swords",
                "The effigy of a knight in the attitude of prayer, at full length upon his tomb",
                "http://www.learntarot.com/bigjpgs/swords04.jpg");
        tarotRepository.save(swords04);

        Tarot wands05 = new Tarot(
                "Five of Wands",
                5,
                "Imitation, as, for example, sham fight, but also the strenuous competition and struggle of the search after riches and fortune. In this sense it connects with the battle of life. Hence some attributions say that it is a card of gold, gain, opulence.",
                "Wands",
                "A posse of youths, who are brandishing staves, as if in sport or strife. It is mimic warfare",
                "http://www.learntarot.com/bigjpgs/wands05.jpg");
        tarotRepository.save(wands05);

        Tarot cups06 = new Tarot(
                "Six of Cups",
                6,
                "A card of the past and of memories. Looking back on childhood, happiness, enjoyment, but coming rather from the past. Things that have vanished.",
                "Cups",
                "Children in an old garden, their cups filled with flowers",
                "http://www.learntarot.com/bigjpgs/cups06.jpg");
        tarotRepository.save(cups06);

        Tarot cups10 = new Tarot(
                "Ten of Cups",
                10,
                "Contentment, repose of the entire heart. The perfection of that state. Also perfection of human love and friendship.",
                "Cups",
                "Appearance of Cups in a rainbow. It is contemplated in wonder and ecstasy by a man and woman below, evidently husband and wife.",
                "http://www.learntarot.com/bigjpgs/cups10.jpg");
        tarotRepository.save(cups10);

    }


}

