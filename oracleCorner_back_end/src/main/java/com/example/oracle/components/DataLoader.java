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

        Tarot swords01 = new Tarot(
                "The Ace of Swords",
                1,
                "Triumph, the excessive degree in everything, conquest, triumph of force. It is a card of great force, in love as well as in hatred.",
                "Swords",
                "A hand issues from a cloud, grasping as word, the point of which is encircled by a crown.",
                "http://www.learntarot.com/bigjpgs/swords01.jpg");
        tarotRepository.save(swords01);

        Tarot swords02 = new Tarot(
                "Two of Swords",
                2,
                "Being at a stalemate, feeling afraid to act, reaching an impasse",
                "Swords",
                "A hoodwinked female figure balances two swords upon her shoulders.",
                "http://www.learntarot.com/bigjpgs/swords02.jpg");
        tarotRepository.save(swords02);

        Tarot swords03 = new Tarot(
                "Three of Swords",
                3,
                "Removal, absence, delay, division, rupture, dispersion, and all that the design signifies naturally, being too simple and obvious to call for specific enumeration.",
                "Swords",
                "Three swords piercing a heart; cloud and rain behind.",
                "http://www.learntarot.com/bigjpgs/swords03.jpg");
        tarotRepository.save(swords03);

        Tarot swords04 = new Tarot(
                "Four of Swords",
                4,
                "Vigilance, retreat, solitude, hermit's repose, exile, tomb and coffin. It is these last that have suggested the design.",
                "Swords",
                "The effigy of a knight in the attitude of prayer, at full length upon his tomb.",
                "http://www.learntarot.com/bigjpgs/swords04.jpg");
        tarotRepository.save(swords04);

        Tarot swords05 = new Tarot(
                "Five of Swords",
                5,
                "Degradation, destruction, revocation, infamy, dishonour, loss, with the variants and analogues of these.",
                "Swords",
                "A disdainful man looks after two retreating and dejected figures. Their swords lie upon the ground. He carries two others on his left shoulder, and a third sword is in his right hand, point to earth. He is the master in possession of the field.",
                "http://www.learntarot.com/bigjpgs/swords05.jpg");
        tarotRepository.save(swords05);

        Tarot swords06 = new Tarot(
                "Six of Swords",
                6,
                "journey by water, route, way, envoy, commissionary, expedient.",
                "Swords",
                "A ferryman carrying passengers in his punt to the further shore. The course is smooth, and seeing that the freight is light, it may be noted that the work is not beyond his strength.",
                "http://www.learntarot.com/bigjpgs/swords06.jpg");
        tarotRepository.save(swords06);

        Tarot swords07 = new Tarot(
                "Seven of Swords",
                7,
                "Design, attempt, wish, hope, confidence; also quarrelling, a plan that may fail, annoyance. The design is uncertain in its import, because the significations are widely at variance with each other.",
                "Swords",
                "A man in the act of carrying away five swords rapidly; the two others of the card remain stuck in the ground. A camp is close at hand.",
                "http://www.learntarot.com/bigjpgs/swords07.jpg");
        tarotRepository.save(swords07);

        Tarot swords08 = new Tarot(
                "Eight of Swords",
                8,
                "Bad news, violent chagrin, crisis, censure, power in trammels, conflict, calumny; also sickness.",
                "Swords",
                "A woman, bound and hoodwinked, with the swords of the card about her. Yet it is rather a card of temporary durance than of irretrievable bondage.",
                "http://www.learntarot.com/bigjpgs/swords08.jpg");
        tarotRepository.save(swords08);

        Tarot swords09 = new Tarot(
                "Nine of Swords",
                9,
                "Death, failure, miscarriage, delay, deception, disappointment, despair.",
                "Swords",
                "One seated on her couch in lamentation, with the swords over her. She is as one who knows no sorrow which is like unto hers. It is a card of utter desolation.",
                "http://www.learntarot.com/bigjpgs/swords09.jpg");
        tarotRepository.save(swords09);

        Tarot swords10 = new Tarot(
                "Ten of Swords",
                10,
                "Whatsoever is intimated by the design; also pain, affliction, tears, sadness, desolation. It is not especially a card of violent death.",
                "Swords",
                "A prostrate figure, pierced by all the swords belonging to the card.",
                "http://www.learntarot.com/bigjpgs/swords10.jpg");
        tarotRepository.save(swords10);

        Tarot swordsPage = new Tarot(
                "Page of Swords",
                11,
                "Authority, overseeing, secret service, vigilance, spying, examination, and the qualities thereto belonging.",
                "Swords",
                "A lithe, active figure holds a sword upright in both hands, while in the act of swift walking.",
                "http://www.learntarot.com/bigjpgs/swords11.jpg");
        tarotRepository.save(swordsPage);

        Tarot swordsKnight = new Tarot(
                "Knight of Swords",
                12,
                "Skill, bravery, capacity, defence, address, enmity, wrath, war, destruction, opposition, resistance, ruin. There is therefore a sense in which the card signifies death, but it carries this meaning only in its proximity to other cards of fatality.",
                "Swords",
                "He is riding in full course, as if scattering his enemies. In the design he is really a prototypical hero of romantic chivalry. He might almost be Galahad, whose sword is swift and sure because he is clean of heart.",
                "http://www.learntarot.com/bigjpgs/swords12.jpg");
        tarotRepository.save(swordsKnight);

                Tarot swordsQueen = new Tarot(
                "Queen of Swords",
                13,
                "Widowhood, female sadness and embarrassment, absence, sterility, mourning, privation, separation.",
                "Swords",
                "Her right hand raises the weapon vertically and the hilt rests on an arm of her royal chair the left hand is extended, the arm raised her countenance is severe but chastened.",
                "http://www.learntarot.com/bigjpgs/swords13.jpg");
        tarotRepository.save(swordsQueen);

        Tarot swordsKing = new Tarot(
                "King of Swords",
                14,
                "Whatsoever arises out of the idea of judgment and all its connexions-power, command, authority, militant intelligence, law, offices of the crown, and so forth.",
                "Swords",
                "He sits in judgment, holding the unsheathed sign of his suit. He recalls, of course, the conventional Symbol of justice in the Trumps Major, and he may represent this virtue, but he is rather the power of life and death, in virtue of his office.",
                "http://www.learntarot.com/bigjpgs/swords14.jpg");
        tarotRepository.save(swordsKing);

        Tarot wands01 = new Tarot(
                "Ace of Wands",
                1,
                "Creation, invention, enterprise, the powers which result in these. Principle, beginning, source, birth, family, origin, and in a sense the virility which is behind the. The starting point of enterprises.",
                "Wands",
                "A hand issuing from a cloud grasps a stout wand or club.",
                "http://www.learntarot.com/bigjpgs/wands01.jpg");
        tarotRepository.save(wands01);

        Tarot wands02 = new Tarot(
                "Two of Wands",
                2,
                "Between the alternative readings there is no marriage possible; on the one hand, riches, fortune, magnificence; on the other, physical suffering, disease, chagrin, sadness, mortification.",
                "Wands",
                "A tall man looks from a battlemented roof over sea and shore; he holds a globe in his right hand, while a staff in his left rests on the battlement",
                "http://www.learntarot.com/bigjpgs/wands02.jpg");
        tarotRepository.save(wands02);

        Tarot wands03 = new Tarot(
                "Three of Wands",
                3,
                "He symbolizes established strength, enterprise, effort, trade, commerce, discovery; those are his ships, bearing his merchandise, which are sailing over the sea. The card also signifies able co-operation in business",
                "Wands",
                "A calm, stately personage, with his back turned, looking from a cliff's edge at ships passing over the sea. Three staves are planted in the ground, and he leans slightly on one of them.",
                "http://www.learntarot.com/bigjpgs/wands03.jpg");
        tarotRepository.save(wands03);

        Tarot wands04 = new Tarot(
                "Four of Wands",
                4,
                "They are for once almost on the surface--country life, haven of refuge, a species of domestic harvest-home, repose, concord, harmony, prosperity, peace, and the perfected work of these.",
                "Wands",
                "From the four great staves planted in the foreground there is a great garland suspended; two female figures uplift nosegays; at their side is a bridge over a moat, leading to an old manorial house.",
                "http://www.learntarot.com/bigjpgs/wands04.jpg");
        tarotRepository.save(wands04);

        Tarot wands05 = new Tarot(
                "Five of Wands",
                5,
                "Imitation, as, for example, sham fight, but also the strenuous competition and struggle of the search after riches and fortune. In this sense it connects with the battle of life. Hence some attributions say that it is a card of gold, gain, opulence.",
                "Wands",
                "A posse of youths, who are brandishing staves, as if in sport or strife. It is mimic warfare",
                "http://www.learntarot.com/bigjpgs/wands05.jpg");
        tarotRepository.save(wands05);

        Tarot wands06 = new Tarot(
                "Six of Wands",
                6,
                "Imitation, as, for example, sham fight, but also the strenuous competition and struggle of the search after riches and fortune. In this sense it connects with the battle of life. Hence some attributions say that it is a card of gold, gain, opulence.",
                "Wands",
                "A posse of youths, who are brandishing staves, as if in sport or strife. It is mimic warfare",
                "http://www.learntarot.com/bigjpgs/wands06.jpg");
        tarotRepository.save(wands06);

        Tarot wands07 = new Tarot(
                "Seven of Wands",
                7,
                "It is a card of valour, for, on the surface, six are attacking one, who has, however, the vantage position. On the intellectual plane, it signifies discussion, wordy strife",
                "Wands",
                "A young man on a craggy eminence brandishing a staff; six other staves are raised towards him from below.",
                "http://www.learntarot.com/bigjpgs/wands07.jpg");
        tarotRepository.save(wands07);

        Tarot wands08 = new Tarot(
                "Eight of Wands",
                8,
                "Activity in undertakings, the path of such activity, swiftness, as that of an express messenger; great haste, great hope, speed towards an end which promises assured felicity.",
                "Wands",
                "The card represents motion through the immovable-a flight of wands through an open country; but they draw to the term of their course. That which they signify is at hand; it may be even on the threshold.",
                "http://www.learntarot.com/bigjpgs/wands08.jpg");
        tarotRepository.save(wands08);

        Tarot wands09 = new Tarot(
                "Nine of Wands",
                9,
                "The card signifies strength in opposition. If attacked, the person will meet an onslaught boldly; and his build shews, that he may prove a formidable antagonist.",
                "Wands",
                "The figure leans upon his staff and has an expectant look, as if awaiting an enemy.",
                "http://www.learntarot.com/bigjpgs/wands09.jpg");
        tarotRepository.save(wands09);

        Tarot wands10 = new Tarot(
                "Ten of Wands",
                10,
                "The chief meaning is oppression simply, but it is also fortune, gain, any kind of success, and then it is the oppression of these things. It is also a card of false-seeming, disguise, perfidy. The place which the figure is approaching may suffer from the rods that he carries",
                "Wands",
                "A man oppressed by the weight of the ten staves which he is carrying.",
                "http://www.learntarot.com/bigjpgs/wands10.jpg");
        tarotRepository.save(wands01);

        Tarot wandsPage = new Tarot(
                "Page of wands",
                11,
                "Dark young man, faithful, a lover, an envoy, a postman. Beside a man, he will bear favourable testimony concerning him. A dangerous rival, if followed by the Page of Cups. Has the chief qualities of his suit",
                "Wands",
                "In a scene similar to the former, a young man stands in the act of proclamation. He is unknown but faithful, and his tidings are strange.",
                "http://www.learntarot.com/bigjpgs/wands11.jpg");
        tarotRepository.save(wandsPage);

        Tarot wandsKnight = new Tarot(
                "Knight of Wands",
                12,
                "Departure, absence, flight, emigration. A dark young man, friendly. Change of residence.",
                "Wands",
                "He is shewn as if upon a journey, armed with a short wand, and although mailed is not on a warlike errand. He is passing mounds or pyramids. The motion of the horse is a key to the character of its rider.",
                "http://www.learntarot.com/bigjpgs/wands12.jpg");
        tarotRepository.save(wandsKnight);

        Tarot wandsQueen = new Tarot(
                "Queen of Wands",
                13,
                "A dark woman, countrywoman, friendly, chaste, loving, honourable. If the card beside her signifies a man, she is well disposed towards him; if a woman, she is interested in the Querent.",
                "Wands",
                "The Wands throughout this suit are always in leaf, as it is a suit of life and animation. Emotionally and otherwise, the Queen's personality corresponds to that of the King, but is more magnetic.",
                "http://www.learntarot.com/bigjpgs/wands13.jpg");
        tarotRepository.save(wandsQueen);

        Tarot wandsKing = new Tarot(
                "King of Wands",
                14,
                "Dark man, friendly, countryman, generally married, honest and conscientious.",
                "Wands",
                "The physical and emotional nature to which this card is attributed is dark, ardent, lithe, animated, impassioned, noble. The King uplifts a flowering wand, and wears, like his three correspondences in the remaining suits, what is called a cap of maintenance beneath his crown.",
                "http://www.learntarot.com/bigjpgs/wands14.jpg");
        tarotRepository.save(wands01);

        Tarot cups01 = new Tarot(
                "Ace of Cups",
                1,
                "House of the true heart, joy, content, abode, nourishment, abundance, fertility; Holy Table, felicity hereof.",
                "Cups",
                "The waters are beneath, and thereon are water-lilies; the hand issues from the cloud, holding in its palm the cup, from which four streams are pouring.",
                "http://www.learntarot.com/bigjpgs/cups01.jpg");
        tarotRepository.save(cups01);

        Tarot cups02 = new Tarot(
                "Two of Cups",
                2,
                "Love, passion, friendship, affinity, union, concord, sympathy, the interrelation of the sexes",
                "Cups",
                "A youth and maiden are pledging one another, and above their cups rises the Caduceus of Hermes.",
                "http://www.learntarot.com/bigjpgs/cups02.jpg");
        tarotRepository.save(cups02);

        Tarot cups03 = new Tarot(
                "Three of Cups",
                3,
                "The conclusion of any matter in plenty, perfection and merriment; happy issue, victory, fulfilment, solace, healing.",
                "Cups",
                "Maidens in a garden-ground with cups uplifted, as if pledging one another.",
                "http://www.learntarot.com/bigjpgs/cups03.jpg");
        tarotRepository.save(cups03);

        Tarot cups04 = new Tarot(
                "Four of Cups",
                4,
                "Weariness, disgust, aversion, imaginary vexations, as if the wine of this world had caused satiety only.",
                "Cups",
                "A young man is seated under a tree and contemplates three cups set on the grass before him; an arm issuing from a cloud offers him another cup. His expression notwithstanding is one of discontent with his environment.",
                "http://www.learntarot.com/bigjpgs/cups04.jpg");
        tarotRepository.save(cups04);

        Tarot cups05 = new Tarot(
                "Five of Cups",
                5,
                "It is a card of loss, but something remains over; three have been taken, but two are left; it is a card of inheritance, patrimony, transmission, but not corresponding to expectations; with some interpreters it is a card of marriage.",
                "Cups",
                "A dark, cloaked figure, looking sideways at three prone cups two others stand upright behind him; a bridge is in the background, leading to a small keep or holding",
                "http://www.learntarot.com/bigjpgs/cups05.jpg");
        tarotRepository.save(cups05);

        Tarot cups06 = new Tarot(
                "Six of Cups",
                6,
                "On the surface, it is a victor triumphing, but it is also great news, such as might be carried in state by the King's courier; it is expectation crowned with its own desire, the crown of hope, and so forth.",
                "Cups",
                "A laurelled horseman bears one staff adorned with a laurel crown; footmen with staves are at his side.",
                "http://www.learntarot.com/bigjpgs/cups06.jpg");
        tarotRepository.save(cups06);

        Tarot cups07 = new Tarot(
                "Seven of Cups",
                7,
                "airy favours, images of reflection, sentiment, imagination, things seen in the glass of contemplation",
                "Cups",
                "Strange chalices of vision, but the images are more especially those of the fantastic spirit.",
                "http://www.learntarot.com/bigjpgs/cups07.jpg");
        tarotRepository.save(cups07);

        Tarot cups08 = new Tarot(
                "Eight of Cups",
                8,
                "The card speaks for itself on the surface, but other readings are entirely antithetical--giving joy, mildness, timidity, honour, modesty.",
                "Cups",
                "A man of dejected aspect is deserting the cups of his felicity, enterprise, undertaking or previous concern.",
                "http://www.learntarot.com/bigjpgs/cups08.jpg");
        tarotRepository.save(cups08);

        Tarot cups09 = new Tarot(
                "Nine of Cups",
                9,
                "Concord, contentment, physical bien-être; also victory, success, advantage; satisfaction for the Querent or person for whom the consultation is made.",
                "Cups",
                "A goodly personage has feasted to his heart's content, and abundant refreshment of wine is on the arched counter behind him, seeming to indicate that the future is also assured.",
                "http://www.learntarot.com/bigjpgs/cups09.jpg");
        tarotRepository.save(cups09);

        Tarot cups10 = new Tarot(
                "Ten of Cups",
                10,
                "Contentment, repose of the entire heart. The perfection of that state. Also perfection of human love and friendship.",
                "Cups",
                "Appearance of Cups in a rainbow. It is contemplated in wonder and ecstasy by a man and woman below, evidently husband and wife.",
                "http://www.learntarot.com/bigjpgs/cups10.jpg");
        tarotRepository.save(cups10);

        Tarot cupsPage = new Tarot(
                "Page of Cups",
                11,
                "The Querent will be connected; a studious youth; news, message; application, reflection, meditation; also these things directed to business.",
                "Cups",
                "A fair, pleasing, somewhat effeminate page, of studious and intent aspect, contemplates a fish rising from a cup to look at him. It is the pictures of the mind taking form.",
                "http://www.learntarot.com/bigjpgs/cups11.jpg");
        tarotRepository.save(cupsPage);

        Tarot cupsKnight = new Tarot(
                "Knight of Cups",
                12,
                "Arrival, approach--sometimes that of a messenger; advances, proposition, demeanour, invitation, incitement.",
                "Cups",
                "Graceful, but not warlike; riding quietly, wearing a winged helmet, referring to those higher graces of the imagination which sometimes characterize this card.",
                "http://www.learntarot.com/bigjpgs/cups12.jpg");
        tarotRepository.save(cupsKnight);

        Tarot cupsQueen = new Tarot(
                "Queen of Cups",
                13,
                "Good, fair woman; honest, devoted woman, who will do service to the Querent; loving intelligence, and hence the gift of vision; success, happiness, pleasure; also wisdom, virtue; a perfect spouse and a good mother.",
                "Cups",
                "Beautiful, fair, dreamy--as one who sees visions in a cup. This is, however, only one of her aspects; she sees, but she also acts, and her activity feeds her dream.",
                "http://www.learntarot.com/bigjpgs/cups13.jpg");
        tarotRepository.save(cupsQueen);

        Tarot cupsKing = new Tarot(
                "King of Cups",
                14,
                "Fair man, man of business, law, or divinity; responsible, disposed to oblige the Querent; also equity, art and science, including those who profess science, law and art; creative intelligence.",
                "Cups",
                "He holds a short sceptre in his left hand and a great cup in his right; his throne is set upon the sea; on one side a ship is riding and on the other a dolphin is leaping.",
                "http://www.learntarot.com/bigjpgs/cups14.jpg");
        tarotRepository.save(cupsKing);

        Tarot pentacles01 = new Tarot(
                "Ace of Pentacles",
                01,
                "Perfect contentment, felicity, ecstasy; also speedy intelligence; gold.",
                "Pentacles",
                "A hand--issuing, as usual, from a cloud--holds up a pentacle.",
                "http://www.learntarot.com/bigjpgs/pents01.jpg");
        tarotRepository.save(pentacles01);

        Tarot pentacles02 = new Tarot(
                "Two of Pentacles",
                02,
                "On the one hand it is represented as a card of gaiety, recreation and its connexions, which is the subject of the design; but it is read also as news and messages in writing, as obstacles, agitation, trouble, embroilment.",
                "Pentacles",
                "A young man, in the act of dancing, has a pentacle in either hand, and they are joined by that endless cord which is like the number 8 reversed.",
                "http://www.learntarot.com/bigjpgs/pents02.jpg");
        tarotRepository.save(pentacles02);

        Tarot pentacles03 = new Tarot(
                "Three of Pentacles",
                03,
                "Trade, skilled labour; usually, however, regarded as a card of nobility, aristocracy, renown, glory.",
                "Pentacles",
                "A sculptor at his work in a monastery. Compare the design which illustrates the Eight of Pentacles. The apprentice or amateur therein has received his reward and is now at work in earnest.",
                "http://www.learntarot.com/bigjpgs/pents03.jpg");
        tarotRepository.save(pentacles03);

        Tarot pentacles04 = new Tarot(
                "Four of Pentacles",
                04,
                "The surety of possessions, cleaving to that which one has, gift, legacy, inheritance.",
                "Pentacles",
                "A crowned figure, having a pentacle over his crown, clasps another with hands and arms; two pentacles are under his feet. He holds to that which he has.",
                "http://www.learntarot.com/bigjpgs/pents04.jpg");
        tarotRepository.save(pentacles04);

        Tarot pentacles05 = new Tarot(
                "Five of Pentacles",
                05,
                "The card foretells material trouble above all, whether in the form illustrated--that is, destitution--or otherwise.",
                "Pentacles",
                "Two mendicants in a snow-storm pass a lighted casement.",
                "http://www.learntarot.com/bigjpgs/pents05.jpg");
        tarotRepository.save(pentacles05);

        Tarot pentacles06 = new Tarot(
                "Six of Pentacles",
                06,
                "Presents, gifts, gratification another account says attention, vigilance now is the accepted time, present prosperity, etc.",
                "Pentacles",
                "A person in the guise of a merchant weighs money in a pair of scales and distributes it to the needy and distressed.",
                "http://www.learntarot.com/bigjpgs/pents06.jpg");
        tarotRepository.save(pentacles06);

        Tarot pentacles07 = new Tarot(
                "Seven of Pentacles",
                07,
                "These are exceedingly contradictory; in the main, it is a card of money, business, barter; but one reading gives altercation, quarrels--and another innocence, ingenuity, purgation.",
                "Pentacles",
                "A young man, leaning on his staff, looks intently at seven pentacles attached to a clump of greenery on his right; one would say that these were his treasures and that his heart was there.",
                "http://www.learntarot.com/bigjpgs/pents07.jpg");
        tarotRepository.save(pentacles07);

        Tarot pentacles08 = new Tarot(
                "Eight of Pentacles",
                8,
                "Work, employment, commission, craftsmanship, skill in craft and business, perhaps in the preparatory stage.",
                "Pentacles",
                "An artist in stone at his work, which he exhibits in the form of trophies.",
                "http://www.learntarot.com/bigjpgs/pents08.jpg");
        tarotRepository.save(pentacles08);

        Tarot pentacles09 = new Tarot(
                "Nine of Pentacles",
                9,
                "Prudence, safety, success, accomplishment, certitude, discernment.",
                "Pentacles",
                "A woman, with a bird upon her wrist, stands amidst a great abundance of grapevines in the garden of a manorial house. It is a wide domain, suggesting plenty in all things. Possibly it is her own possession and testifies to material well-being.",
                "http://www.learntarot.com/bigjpgs/pents09.jpg");
        tarotRepository.save(pentacles09);

        Tarot pentacles10 = new Tarot(
                "Ten of Pentacles",
                10,
                "Gain, riches; family matters, archives, extraction, the abode of a family.",
                "Pentacles",
                "A man and woman beneath an archway which gives entrance to a house and domain. They are accompanied by a child, who looks curiously at two dogs accosting an ancient personage seated in the foreground. The child's hand is on one of them.",
                "http://www.learntarot.com/bigjpgs/pents10.jpg");
        tarotRepository.save(pentacles10);

        Tarot pentaclesPage = new Tarot(
                "Page of Pentacles",
                11,
                "Application, study, scholarship, reflection another reading says news, messages and the bringer thereof; also rule, management.",
                "Pentacles",
                "A youthful figure, looking intently at the pentacle which hovers over his raised hands. He moves slowly, insensible of that which is about him.",
                "http://www.learntarot.com/bigjpgs/pents11.jpg");
        tarotRepository.save(pentaclesPage);

        Tarot pentaclesKnight = new Tarot(
                "Knight of Pentacles",
                12,
                "Utility, serviceableness, interest, responsibility, rectitude-all on the normal and external plane.",
                "Pentacles",
                "He rides a slow, enduring, heavy horse, to which his own aspect corresponds. He exhibits his symbol, but does not look therein.",
                "http://www.learntarot.com/bigjpgs/pents12.jpg");
        tarotRepository.save(pentaclesKnight);

        Tarot pentaclesQueen = new Tarot(
                "Queen of Pentacles",
                14,
                "Opulence, generosity, magnificence, security, liberty.",
                "Pentacles",
                "The face suggests that of a dark woman, whose qualities might be summed up in the idea of greatness of soul; she has also the serious cast of intelligence; she contemplates her symbol and may see worlds therein.",
                "http://www.learntarot.com/bigjpgs/pents14.jpg");
        tarotRepository.save(pentaclesQueen);

        Tarot pentaclesKing = new Tarot(
                "King of Pentacles",
                14,
                "Valour, realizing intelligence, business and normal intellectual aptitude, sometimes mathematical gifts and attainments of this kind; success in these paths.",
                "Pentacles",
                "The figure calls for no special description the face is rather dark, suggesting also courage, but somewhat lethargic in tendency. The bull's head should be noted as a recurrent symbol on the throne.",
                "http://www.learntarot.com/bigjpgs/pents14.jpg");
        tarotRepository.save(pentaclesKing);



    }


}

