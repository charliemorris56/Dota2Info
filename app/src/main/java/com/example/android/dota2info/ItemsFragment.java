package com.example.android.dota2info;


import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.SupportActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Observer;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemsFragment extends Fragment {

    public ItemsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)   {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        //Consumables
        words.add(new Word("Consumables", "", R.drawable.shop_consumables, "Consumables"));
        words.add(new Word("Clarity (50)", "", R.drawable.clarity, "ClarityActivity"));
        words.add(new Word("Faerie Fire (70)", "", R.drawable.faerie_fire, "FaerieFireActivity"));
        words.add(new Word("Enchanted Mango (100)", "", R.drawable.enchanted_mango, "EnchantedMangoActivity"));
        words.add(new Word("Tango (125)", "", R.drawable.tango, "TangoActivity"));
        words.add(new Word("Healing Salve (10)", "", R.drawable.healing_salve, "HealingSalveActivity"));
        words.add(new Word("Smoke of Deceit (50)", "", R.drawable.smoke_of_deceit, "SmokeOfDeceitActivity"));
        words.add(new Word("Town Portal Scroll (50)", "", R.drawable.town_portal_scroll, "TownPortalScroolActivity"));
        words.add(new Word("Dust of Appearance (180)", "", R.drawable.dust_of_appearance, "DustOfAppearanceActivity"));
        words.add(new Word("Animal Courier (100)", "", R.drawable.animal_courier, "AnimalCourierActivity"));
        words.add(new Word("Flying Courier (150)", "", R.drawable.flying_courier, "FlyingCourierActivity"));
        words.add(new Word("Observer Ward (60)", "", R.drawable.observer_ward, "ObserverWardActivity"));
        words.add(new Word("Sentry Ward (100)", "", R.drawable.sentry_ward, "SentryWardActivity"));
        words.add(new Word("Tome of Knowledge (150)", "", R.drawable.tome_of_knowledge, "TomeOfKnowledgeActivity"));
        words.add(new Word("Bottle (650)", "", R.drawable.bottle, "BottleActivity"));
        //Atributes
        words.add(new Word("Attributes", "", R.drawable.shop_attributes, "Attributes"));
        words.add(new Word("Iron Branch (50)", "", R.drawable.iron_branch, "IronBranchActivity"));
        words.add(new Word("Gauntlets of Strength (150)", "", R.drawable.gauntlets_of_strength, "GauntletsOfStrengthActivity"));
        words.add(new Word("Slippers of Agility (150)", "", R.drawable.slippers_of_agility, "SlippersOfAgilityActivity"));
        words.add(new Word("Mantle of Intelligence (150)", "", R.drawable.mantle_of_intelligence, "MantleOfIntelligenceActivity"));
        words.add(new Word("Circlet (165)", "", R.drawable.circlet, "CircletActivity"));
        words.add(new Word("Belt of Strength (450)", "", R.drawable.belt_of_strength, "BeltOfStrengthActivity"));
        words.add(new Word("Band of Elvenskin (450)", "", R.drawable.band_of_elvenskin, "BandOfElvenskinActivity"));
        words.add(new Word("Robe of the Magi (450)", "", R.drawable.robe_of_the_magi, "RobeOfTheMagiActivity"));
        words.add(new Word("Ogre Club (1000)", "", R.drawable.ogre_club, "OgreClubActivity"));
        words.add(new Word("Blade of Alacrity (1000)", "", R.drawable.blade_of_alacrity, "BladeOfAlacrityActivity"));
        words.add(new Word("Staff of Wizardry (1000)", "", R.drawable.staff_of_wizardry, "StaffOfWizardryActivity"));
        //Armaments
        words.add(new Word("Armaments", "", R.drawable.shop_armaments, "Armaments"));
        words.add(new Word("Ring of Protection (175)", "", R.drawable.ring_of_protection, "RingOfProtectionActivity"));
        words.add(new Word("Stout Shield (200)", "", R.drawable.stout_shield, "StoutShieldActivity"));
        words.add(new Word("Quelling Blade (200)", "", R.drawable.quelling_blade, "QuellingBladeActivity"));
        words.add(new Word("Infused Raindrop (225)", "", R.drawable.infused_raindrop, "InfusedRaindropActivity"));
        words.add(new Word("Blight Stone (300)", "", R.drawable.blight_stone, "BlightStoneActivity"));
        words.add(new Word("Orb of Venom (275)", "", R.drawable.orb_of_venom, "OrbOfVenomActivity"));
        words.add(new Word("Blades of Attack (420)", "", R.drawable.blades_of_attack, "BladesOfAttackActivity"));
        words.add(new Word("Chainmail (550)", "", R.drawable.chainmail, "ChainmailActivity"));
        words.add(new Word("Quarterstaff (875)", "", R.drawable.quarterstaff, "QuarterstaffActivity"));
        words.add(new Word("Helm of Iron Will (900)", "", R.drawable.helm_of_iron_will, "HelmOfIronWillActivity"));
        words.add(new Word("Broadsword (1200)", "", R.drawable.broadsword, "BroadswordActivity"));
        words.add(new Word("Claymore (1400)", "", R.drawable.claymore, "ClaymoreActivity"));
        words.add(new Word("Javelin (1500)", "", R.drawable.javelin, "JavelinActivity"));
        words.add(new Word("Mithril Hammer (1600)", "", R.drawable.mithril_hammer, "MithrilHammerActivity"));
        //Arcane
        words.add(new Word("Arcane", "", R.drawable.shop_arcane, "Arcane"));
        words.add(new Word("Wind Lace (250)", "", R.drawable.wind_lace, "WindLaceActivity"));
        words.add(new Word("Magic Stick (200)", "", R.drawable.magic_stick, "MagicStickActivity"));
        words.add(new Word("Sage's Mask (325)", "", R.drawable.sages_mask, "SageMaskActivity"));
        words.add(new Word("Ring of Regen (325)", "", R.drawable.ring_of_regen, "RingOfRegenActivity"));
        words.add(new Word("Boots of Speed (400)", "", R.drawable.boots_of_speed, "BootsOfSpeedActivity"));
        words.add(new Word("Gloves of Haste (500)", "", R.drawable.gloves_of_haste, "GlovesOfHasteActivity"));
        words.add(new Word("Cloak (550)", "", R.drawable.cloak, "CloakActivity"));
        words.add(new Word("Right of Health (850)", "", R.drawable.ring_of_health, "RightOfHealthActivity"));
        words.add(new Word("Void Stone (850)", "", R.drawable.void_stone, "VoidStoneActivity"));
        words.add(new Word("Gem of True Sight (900)", "", R.drawable.gem_of_true_sight, "GemOfTrueSightActivity"));
        words.add(new Word("Morbid Mask (1100)", "", R.drawable.morbid_mask, "MorbidMaskActivity"));
        words.add(new Word("Shadow Amulet (1300)", "", R.drawable.shadow_amulet, "ShadowAmuletActivity"));
        words.add(new Word("Ghost Scepter (1500)", "", R.drawable.ghost_scepter, "GhostScepterActivity"));
        words.add(new Word("Blink Dagger (2250)", "", R.drawable.blink_dagger, "BlinkDaggerActivity"));
        //Common
        words.add(new Word("Common", "", R.drawable.shop_common, "Common"));
        words.add(new Word("Magic Wand (465)", "", R.drawable.magic_wand, "MagicWandActivity"));
        words.add(new Word("Null Talisman (470)", "", R.drawable.null_talisman, "NullTalismanActivity"));
        words.add(new Word("Wraith Band (485)", "", R.drawable.wraith_band, "WraithBandActivity"));
        words.add(new Word("Poor Man's Shield (500)", "", R.drawable.poor_mans_shield, "PoorMansShieldActivity"));
        words.add(new Word("Bracer (490)", "", R.drawable.bracer, "BracerActivity"));
        words.add(new Word("Soul Ring (750)", "", R.drawable.soul_ring, "SoulRingActivity"));
        words.add(new Word("Phase Boots (1240)", "", R.drawable.phase_boots, "PhaseBootsActivity"));
        words.add(new Word("Power Treads (1350)", "", R.drawable.power_treads, "PowerTreadsActivity"));
        words.add(new Word("Oblivion Staff (1850)", "", R.drawable.oblivion_staff, "OblivionStaffActivity"));
        words.add(new Word("Perseverance (1700)", "", R.drawable.perseverance, "PerseveranceActivity"));
        words.add(new Word("Hand of Midas (2150)", "", R.drawable.hand_of_midas, "HandOfMidasActivity"));
        words.add(new Word("Boots of Travel (2400)", "", R.drawable.boots_of_travel_1, "BootsOfTravelActivity"));
        words.add(new Word("Moon Shard (4000)", "", R.drawable.moon_shard, "MoonShardActivity"));
        //Support
        words.add(new Word("Support", "", R.drawable.shop_support, "Support"));
        words.add(new Word("Ring of Basilius (500)", "", R.drawable.ring_of_basilius, "RingOfBasiliusActivity"));
        words.add(new Word("Iron Talon (500)", "", R.drawable.iron_talon, "IronTalonActivity"));
        words.add(new Word("Headdress (675)", "", R.drawable.headdress, "HeaddressActivity"));
        words.add(new Word("Buckler (800)", "", R.drawable.buckler, "BucklerActivity"));
        words.add(new Word("Urn of Shadows (875)", "", R.drawable.urn_of_shadows, "UrnOfShadowsActivity"));
        words.add(new Word("Tranquil Boots (975)", "", R.drawable.tranquil_boots, "TranquilBootsActivity"));
        words.add(new Word("Right of Aquila (985)", "", R.drawable.ring_of_aquila, "RingOfAquilaActivity"));
        words.add(new Word("Medallion of Courage (1175)", "", R.drawable.medallion_of_courage, "MedallionOfCourageActivity"));
        words.add(new Word("Arcane Boots (1300)", "", R.drawable.arcane_boots, "ArcaneBootsActivity"));
        words.add(new Word("Drum of Endurance (1640)", "", R.drawable.drum_of_endurance, "DrumOfEnduranceActivity"));
        words.add(new Word("Mekansm (2375)", "", R.drawable.mekansm, "MekansmActivity"));
        words.add(new Word("Vladmir's Offering (2275)", "", R.drawable.vladmirs_offering, "VladmirsOfferingActivity"));
        words.add(new Word("Pipe of Insight (3200)", "", R.drawable.pipe_of_insight, "PipeOfInsightActivity"));
        words.add(new Word("Guardian Greaves (5375)", "", R.drawable.guardian_greaves, "GuardianGreavesActivity"));
        //Caster
        words.add(new Word("Caster", "", R.drawable.shop_caster, "Caster"));
        words.add(new Word("Glimmer Cape (1850)", "", R.drawable.glimmer_cape, "GlimmerCapeActivity"));
        words.add(new Word("Force Staff (2250)", "", R.drawable.force_staff, "ForceStaffActivity"));
        words.add(new Word("Veil of Discord (2340)", "", R.drawable.veil_of_discord, "VeilOfDiscordActivity"));
        words.add(new Word("Aether Lens (2350)", "", R.drawable.aether_lens, "AetherLensActivity"));
        words.add(new Word("Necronomicon (2650)", "", R.drawable.necronomicon, "NecronomiconActivity"));
        words.add(new Word("Dagon (2720)", "", R.drawable.dagon, "DagonActivity"));
        words.add(new Word("Eul's Scepter of Divinity (2750)", "", R.drawable.euls_scepter_of_divinity, "EulsScepterOfDivinityActivity"));
        words.add(new Word("Solar Crest (2625)", "", R.drawable.solar_crest, "SolarCrestActivity"));
        words.add(new Word("Rod of Atos (3080)", "", R.drawable.rod_of_atos, "RodOfAtosActivity"));
        words.add(new Word("Orchid Malevolence (4075)", "", R.drawable.orchid_malevolence, "OrchidMalevolenceActivity"));
        words.add(new Word("Aghanim's Scepter (4200)", "", R.drawable.aghanims_scepter, "AghanimsScepterActivity"));
        words.add(new Word("Refresher Orb (5200)", "", R.drawable.refresher_orb, "RefresherOrbActivity"));
        words.add(new Word("Scythe of Vyse (5700)", "", R.drawable.scythe_of_vyse, "ScytheOfVyseActivity"));
        words.add(new Word("Octarine Core (5900)", "", R.drawable.octarine_core, "OctarineCoreActivity"));
        //Weapons
        words.add(new Word("Weapons", "", R.drawable.shop_weapons, "Weapons"));
        words.add(new Word("Crystalys (2120)", "", R.drawable.crystalys, "CrystalysActivity"));
        words.add(new Word("Armlet of Mordiggian (2370)", "", R.drawable.armlet_of_mordiggian, "ArmletOfMordiggianActivity"));
        words.add(new Word("Shadow Blade (2700)", "", R.drawable.shadow_blade, "ShadowBladeActivity"));
        words.add(new Word("Skull Basher (2700)", "", R.drawable.skull_basher, "SkullBasherActivity"));
        words.add(new Word("Battle Fury (4500)", "", R.drawable.battle_fury, "BattleFuryActivity"));
        words.add(new Word("Ethereal Blade (4700)", "", R.drawable.ethereal_blade, "EtherealBladeActivity"));
        words.add(new Word("Silver Edge (5550)", "", R.drawable.silver_edge, "SilverEdgeActivity"));
        words.add(new Word("Radiance (5150)", "", R.drawable.radiance, "RadianceActivity"));
        words.add(new Word("Monkey King Bar (5200)", "", R.drawable.monkey_king_bar, "MonkeyKingBarActivity"));
        words.add(new Word("Daedalus (5320)", "", R.drawable.daedalus, "DaedalusActivity"));
        words.add(new Word("Butterfly (5525)", "", R.drawable.butterfly, "ButterflyActivity"));
        words.add(new Word("Divine Rapier (6000)", "", R.drawable.divine_rapier, "DivineRapierActivity"));
        words.add(new Word("Abyssal Blade (6400)", "", R.drawable.abyssal_blade, "AbyssalBladeActivity"));
        words.add(new Word("Bloodthorn (7195)", "", R.drawable.bloodthorn, "BloodthornActivity"));
        //Armor
        words.add(new Word("Armor", "", R.drawable.shop_armor, "Armor"));
        words.add(new Word("Hood of Defiance (1725)", "", R.drawable.hood_of_defiance, "HoodOfDefianceActivity"));
        words.add(new Word("Vanguard (2150)", "", R.drawable.vanguard, "VanguardActivity"));
        words.add(new Word("Blade Mail (2200)", "", R.drawable.blade_mail, "BladeMailActivity"));
        words.add(new Word("Soul Booster (3200)", "", R.drawable.soul_booster, "SoulBoosterActivity"));
        words.add(new Word("Crimson Guard (3550)", "", R.drawable.crimson_guard, "CrimsonGuardActivity"));
        words.add(new Word("Black King Bar (3975)", "", R.drawable.black_king_bar, "BlackKingBarActivity"));
        words.add(new Word("Lotus Orb (4000)", "", R.drawable.lotus_orb, "LotusOrbActivity"));
        words.add(new Word("Shiva's Guard (4750)", "", R.drawable.shivas_guard, "ShivasGuardActivity"));
        words.add(new Word("Bloodstone (4850)", "", R.drawable.bloodstone, "BloodstoneActivity"));
        words.add(new Word("Manta Style (5000)", "", R.drawable.manta_style, "MantaStyleActivity"));
        words.add(new Word("Linken's Sphere (4850)", "", R.drawable.linkens_sphere, "LinkensSphereActivity"));
        words.add(new Word("Hurricane Pike (4650)", "", R.drawable.hurricane_pike, "HurricanePikeActivity"));
        words.add(new Word("Assault Cuirass (5250)", "", R.drawable.assault_cuirass, "AssaultCuirassActivity"));
        words.add(new Word("Heart of Tarrasque (5200)", "", R.drawable.heart_of_tarrasque, "HeartOfTarrasqueActivity"));
        //Artifacts
        words.add(new Word("Artifacts", "", R.drawable.shop_artifacts, "Artifact"));
        words.add(new Word("Mask of Madness (1975)", "", R.drawable.mask_of_madness, "MaskOfMadnessActivity"));
        words.add(new Word("Helm of the Dominator (2025)", "", R.drawable.helm_of_the_dominator, "HelmOfTheDominatorActivity"));
        words.add(new Word("Dragon Lance (1900)", "", R.drawable.dragon_lance, "DragonLanceActivity"));
        words.add(new Word("Sange (1950)", "", R.drawable.sange, "SangeActivity"));
        words.add(new Word("Yasha (1950)", "", R.drawable.yasha, "YashaActivity"));
        words.add(new Word("Echo Sabre (2650)", "", R.drawable.echo_sabre, "EchoSabreActivity"));
        words.add(new Word("Maelstorm (2800)", "", R.drawable.maelstrom, "MaelstormActivity"));
        words.add(new Word("Diffusal Blade (3150)", "", R.drawable.diffusal_blade, "DiffusalBladeActivity"));
        words.add(new Word("Desolator (3500)", "", R.drawable.desolator, "DesolatorActivity"));
        words.add(new Word("Heaven's Halberd (3400)", "", R.drawable.heavens_halberd, "HeavensHalberdActivity"));
        words.add(new Word("Sange and Yasha (3900)", "", R.drawable.sange_and_yasha, "SangeAndYashaActivity"));
        words.add(new Word("Eye of Skadi (5775)", "", R.drawable.eye_of_skadi, "EyeOfSkadiActivity"));
        words.add(new Word("Mjollnir (5700)", "", R.drawable.mjollnir, "MjollnirActivity"));
        words.add(new Word("Satanic (5700)", "", R.drawable.satanic, "SatanicActivity"));
        //Secret
        words.add(new Word("Secret", "", R.drawable.shop_unknown, "Secret"));
        words.add(new Word("Energy Booster (900)", "", R.drawable.energy_booster, "EnergyBoosterActivity"));
        words.add(new Word("Point Booster (1200)", "", R.drawable.point_booster, "PointBoosterActivity"));
        words.add(new Word("Vitality Booster (1100)", "", R.drawable.vitality_booster, "VitalityBoosterActivity"));
        words.add(new Word("Platemail (1400)", "", R.drawable.platemail, "PlatemailActivity"));
        words.add(new Word("Talisman of Evasion (1450)", "", R.drawable.talisman_of_evasion, "TalismanOfEvasionActivity"));
        words.add(new Word("Hyperstone (2000)", "", R.drawable.hyperstone, "HyperstoneActivity"));
        words.add(new Word("Ultimate Orb (2150)", "", R.drawable.ultimate_orb, "UltimateOrbActivity"));
        words.add(new Word("Demon Edge (2200)", "", R.drawable.demon_edge, "DemonEdgeActivity"));
        words.add(new Word("Mystic Staff (2700)", "", R.drawable.mystic_staff, "MysticStaffActivity"));
        words.add(new Word("Reaver (3000)", "", R.drawable.reaver, "ReaverActivity"));
        words.add(new Word("Eaglesong (3200)", "", R.drawable.eaglesong, "EaglesongActivity"));
        words.add(new Word("Sacred Relic (3800)", "", R.drawable.sacred_relic, "SacredRelicActivity"));
        //Dropped
        words.add(new Word("Dropped", "", R.drawable.roshan_minimap, "Dropped"));
        words.add(new Word("Aegis of the Immortal", "", R.drawable.aegis_of_the_immortal, "AegisOfTheImmortalActivity"));
        words.add(new Word("Cheese", "", R.drawable.cheese, "CheeseActivity"));

        final WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("ItemsFragments", "Position: " + position);

                Word word = words.get(position);

                try {   //("com.example.android.dota2info.ClarityActivity");word.getClassResource();
                    Class c = Class.forName("com.example.android.dota2info."+word.getClassResource());   //com/example/android/dota2info/ClarityActivity.java
                    Intent mIntent = new Intent(view.getContext(), c);
                    startActivity(mIntent);
                } catch (ClassNotFoundException e)  {
                    e.printStackTrace();
                    Log.i("ItemsFragments", "Class not found.");
                }

                if (word.getClassResource().equals("Consumables"))  {
                    Toast.makeText(getContext(), "Consumables", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Attributes")) {
                    Toast.makeText(getContext(), "Attributes", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Armaments")) {
                    Toast.makeText(getContext(), "Armaments", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Arcane")) {
                    Toast.makeText(getContext(), "Arcane", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Secret")) {
                    Toast.makeText(getContext(), "Secret", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Common")) {
                    Toast.makeText(getContext(), "Common", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Support")) {
                    Toast.makeText(getContext(), "Support", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Caster")) {
                    Toast.makeText(getContext(), "Caster", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Armor")) {
                    Toast.makeText(getContext(), "Armor", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Weapons")) {
                    Toast.makeText(getContext(), "Weapons", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Artifacts")) {
                    Toast.makeText(getContext(), "Artifacts", Toast.LENGTH_SHORT).show();
                }   else if (word.getClassResource().equals("Dropped")) {
                    Toast.makeText(getContext(), "Dropped", Toast.LENGTH_SHORT).show();
                }

//                //Consumables
//                Intent clarityIntent = new Intent(view.getContext(), ClarityActivity.class);
//                Intent smokeOfDeceitIntent = new Intent(view.getContext(), SmokeOfDeceitActivity.class);
//                Intent townPortalScroolIntent = new Intent(view.getContext(), TownPortalScroolActivity.class);
//                Intent observerWardIntent = new Intent(view.getContext(), ObserverWardActivity.class);
//                Intent faerieFireIntent = new Intent(view.getContext(), FaerieFireActivity.class);
//                Intent animalCourierIntent = new Intent(view.getContext(), AnimalCourierActivity.class);
//                Intent enchantedMangoIntent = new Intent(view.getContext(), EnchantedMangoActivity.class);
//                Intent sentryWardIntent = new Intent(view.getContext(), SentryWardActivity.class);
//                Intent healingSalveIntent = new Intent(view.getContext(), HealingSalveActivity.class);
//                Intent tangoIntent = new Intent(view.getContext(), TangoActivity.class);
//                Intent tomeOfKnowledgeIntent = new Intent(view.getContext(), TomeOfKnowledgeActivity.class);
//                Intent dustOfAppearanceIntent = new Intent(view.getContext(), DustOfAppearanceActivity.class);
//                Intent flyingCourierIntent = new Intent(view.getContext(), FlyingCourierActivity.class);
//                Intent bottleIntent = new Intent(view.getContext(), BottleActivity.class);
//                //Atributes
//                Attributes.12345
//                Intent ironBranchIntent = new Intent(view.getContext(), IronBranchActivity.class);
//                Intent gauntletsOfStrengthIntent = new Intent(view.getContext(), GauntletsOfStrengthActivity.class);
//                Intent mantleOfIntelligenceIntent = new Intent(view.getContext(), MantleOfIntelligenceActivity.class);
//                Intent slippersOfAgilityIntent = new Intent(view.getContext(), SlippersOfAgilityActivity.class);
//                Intent circletIntent = new Intent(view.getContext(), CircletActivity.class);
//                Intent bandOfElvenskinIntent = new Intent(view.getContext(), BandOfElvenskinActivity.class);
//                Intent beltOfStrengthIntent = new Intent(view.getContext(), BeltOfStrengthActivity.class);
//                Intent robeOfTheMagiIntent = new Intent(view.getContext(), RobeOfTheMagiActivity.class);
//                Intent bladeOfAlacrityIntent = new Intent(view.getContext(), BladeOfAlacrityActivity.class);
//                Intent ogreClubIntent = new Intent(view.getContext(), OgreClubActivity.class);
//                Intent staffOfWizardryIntent = new Intent(view.getContext(), StaffOfWizardryActivity.class);
//                //Armaments
//                Armaments.12345
//                Intent ringOfProtectionIntent = new Intent(view.getContext(), RingOfProtectionActivity.class);
//                Intent quellingBladeIntent = new Intent(view.getContext(), QuellingBladeActivity.class);
//                Intent stoutShieldIntent = new Intent(view.getContext(), StoutShieldActivity.class);
//                Intent infusedRaindropIntent = new Intent(view.getContext(), InfusedRaindropActivity.class);
//                Intent orbOfVenomIntent = new Intent(view.getContext(), OrbOfVenomActivity.class);
//                Intent blightStoneIntent = new Intent(view.getContext(), BlightStoneActivity.class);
//                Intent bladesOfAttackIntent = new Intent(view.getContext(), BladesOfAttackActivity.class);
//                Intent chainmailIntent = new Intent(view.getContext(), ChainmailActivity.class);
//                Intent quarterstaffIntent = new Intent(view.getContext(), QuarterstaffActivity.class);
//                Intent helmOfIronWillIntent = new Intent(view.getContext(), HelmOfIronWillActivity.class);
//                Intent broadswordIntent = new Intent(view.getContext(), BroadswordActivity.class);
//                Intent claymoreIntent = new Intent(view.getContext(), ClaymoreActivity.class);
//                Intent javelinIntent = new Intent(view.getContext(), JavelinActivity.class);
//                Intent mithrilHammerIntent = new Intent(view.getContext(), MithrilHammerActivity.class);
//                //Arcane
//                Arcane.12345
//                Intent magicStickIntent = new Intent(view.getContext(), MagicStickActivity.class);
//                Intent windLaceIntent = new Intent(view.getContext(), WindLaceActivity.class);
//                Intent ringOfRegenIntent = new Intent(view.getContext(), RingOfRegenActivity.class);
//                Intent sageMaskIntent = new Intent(view.getContext(), SageMaskActivity.class);
//                Intent bootsOfSpeedIntent = new Intent(view.getContext(), BootsOfSpeedActivity.class);
//                Intent glovesOfHasteIntent = new Intent(view.getContext(), GlovesOfHasteActivity.class);
//                Intent cloakIntent = new Intent(view.getContext(), CloakActivity.class);
//                Intent rightOfHealthIntent = new Intent(view.getContext(), RightOfHealthActivity.class);
//                Intent voidStoneIntent = new Intent(view.getContext(), VoidStoneActivity.class);
//                Intent gemOfTrueSightIntent = new Intent(view.getContext(), GemOfTrueSightActivity.class);
//                Intent morbidMaskIntent = new Intent(view.getContext(), MorbidMaskActivity.class);
//                Intent shadowAmuletIntent = new Intent(view.getContext(), ShadowAmuletActivity.class);
//                Intent ghostScepterIntent = new Intent(view.getContext(), GhostScepterActivity.class);
//                Intent blinkDaggerIntent = new Intent(view.getContext(), BlinkDaggerActivity.class);
//                //Secret
//                Secret.12345
//                Intent energyBoosterIntent = new Intent(view.getContext(), EnergyBoosterActivity.class);
//                Intent vitalityBoosterIntent = new Intent(view.getContext(), VitalityBoosterActivity.class);
//                Intent pointBoosterIntent = new Intent(view.getContext(), PointBoosterActivity.class);
//                Intent platemailIntent = new Intent(view.getContext(), PlatemailActivity.class);
//                Intent talismanOfEvasionIntent = new Intent(view.getContext(), TalismanOfEvasionActivity.class);
//                Intent hyperstoneIntent = new Intent(view.getContext(), HyperstoneActivity.class);
//                Intent ultimateOrbIntent = new Intent(view.getContext(), UltimateOrbActivity.class);
//                Intent demonEdgeIntent = new Intent(view.getContext(), DemonEdgeActivity.class);
//                Intent mysticStaffIntent = new Intent(view.getContext(), MysticStaffActivity.class);
//                Intent reaverIntent = new Intent(view.getContext(), ReaverActivity.class);
//                Intent eaglesongIntent = new Intent(view.getContext(), EaglesongActivity.class);
//                Intent sacredRelicIntent = new Intent(view.getContext(), SacredRelicActivity.class);
//                //Common
//                Common.12345
//                Intent magicWandIntent = new Intent(view.getContext(), MagicWandActivity.class);
//                Intent nullTalismanIntent = new Intent(view.getContext(), NullTalismanActivity.class);
//                Intent wraithBandIntent = new Intent(view.getContext(), WraithBandActivity.class);
//                Intent bracerIntent = new Intent(view.getContext(), BracerActivity.class);
//                Intent poorMansShieldIntent = new Intent(view.getContext(), PoorMansShieldActivity.class);
//                Intent soulRingIntent = new Intent(view.getContext(), SoulRingActivity.class);
//                Intent phaseBootsIntent = new Intent(view.getContext(), PhaseBootsActivity.class);
//                Intent powerTreadsIntent = new Intent(view.getContext(), PowerTreadsActivity.class);
//                Intent oblivionStaffIntent = new Intent(view.getContext(), OblivionStaffActivity.class);
//                Intent perseveranceIntent = new Intent(view.getContext(), PerseveranceActivity.class);
//                Intent handOfMidasIntent = new Intent(view.getContext(), HandOfMidasActivity.class);
//                Intent bootsOfTravelIntent = new Intent(view.getContext(), BootsOfTravelActivity.class);
//                Intent moonShardIntent = new Intent(view.getContext(), MoonShardActivity.class);
//                //Support
//                Support.12345
//                Intent ironTalonIntent = new Intent(view.getContext(), IronTalonActivity.class);
//                Intent ringOfBasiliusIntent = new Intent(view.getContext(), RingOfBasiliusActivity.class);
//                Intent headdressIntent = new Intent(view.getContext(), HeaddressActivity.class);
//                Intent bucklerIntent = new Intent(view.getContext(), BucklerActivity.class);
//                Intent urnOfShadowsIntent = new Intent(view.getContext(), UrnOfShadowsActivity.class);
//                Intent tranquilBootsIntent = new Intent(view.getContext(), TranquilBootsActivity.class);
//                Intent ringOfAquilaIntent = new Intent(view.getContext(), RingOfAquilaActivity.class);
//                Intent medallionOfCourageIntent = new Intent(view.getContext(), MedallionOfCourageActivity.class);
//                Intent arcaneBootsIntent = new Intent(view.getContext(), ArcaneBootsActivity.class);
//                Intent drumOfEnduranceIntent = new Intent(view.getContext(), DrumOfEnduranceActivity.class);
//                Intent vladmirsOfferingIntent = new Intent(view.getContext(), VladmirsOfferingActivity.class);
//                Intent mekansmIntent = new Intent(view.getContext(), MekansmActivity.class);
//                Intent pipeOfInsightIntent = new Intent(view.getContext(), PipeOfInsightActivity.class);
//                Intent guardianGreavesIntent = new Intent(view.getContext(), GuardianGreavesActivity.class);
//                //Caster
//                Caster.12345
//                Intent glimmerCapeIntent = new Intent(view.getContext(), GlimmerCapeActivity.class);
//                Intent forceStaffIntent = new Intent(view.getContext(), ForceStaffActivity.class);
//                Intent veilOfDiscordIntent = new Intent(view.getContext(), VeilOfDiscordActivity.class);
//                Intent aetherLensIntent = new Intent(view.getContext(), AetherLensActivity.class);
//                Intent solarCrestIntent = new Intent(view.getContext(), SolarCrestActivity.class);
//                Intent necronomiconIntent = new Intent(view.getContext(), NecronomiconActivity.class);
//                Intent dagonIntent = new Intent(view.getContext(), DagonActivity.class);
//                Intent eulsScepterOfDivinityIntent = new Intent(view.getContext(), EulsScepterOfDivinityActivity.class);
//                Intent rodOfAtosIntent = new Intent(view.getContext(), RodOfAtosActivity.class);
//                Intent orchidMalevolenceIntent = new Intent(view.getContext(), OrchidMalevolenceActivity.class);
//                Intent aghanimsScepterIntent = new Intent(view.getContext(), AghanimsScepterActivity.class);
//                Intent refresherOrbIntent = new Intent(view.getContext(), RefresherOrbActivity.class);
//                Intent scytheOfVyseIntent = new Intent(view.getContext(), ScytheOfVyseActivity.class);
//                Intent octarineCoreIntent = new Intent(view.getContext(), OctarineCoreActivity.class);
//                //Armor
//                Armor.12345
//                Intent hoodOfDefianceIntent = new Intent(view.getContext(), HoodOfDefianceActivity.class);
//                Intent vanguardIntent = new Intent(view.getContext(), VanguardActivity.class);
//                Intent bladeMailIntent = new Intent(view.getContext(), BladeMailActivity.class);
//                Intent soulBoosterIntent = new Intent(view.getContext(), SoulBoosterActivity.class);
//                Intent crimsonGuardIntent = new Intent(view.getContext(), CrimsonGuardActivity.class);
//                Intent blackKingBarIntent = new Intent(view.getContext(), BlackKingBarActivity.class);
//                Intent lotusOrbIntent = new Intent(view.getContext(), LotusOrbActivity.class);
//                Intent hurricanePikeIntent = new Intent(view.getContext(), HurricanePikeActivity.class);
//                Intent shivasGuardIntent = new Intent(view.getContext(), ShivasGuardActivity.class);
//                Intent bloodstoneIntent = new Intent(view.getContext(), BloodstoneActivity.class);
//                Intent linkensSphereIntent = new Intent(view.getContext(), LinkensSphereActivity.class);
//                Intent mantaStyleIntent = new Intent(view.getContext(), MantaStyleActivity.class);
//                Intent heartOfTarrasqueIntent = new Intent(view.getContext(), HeartOfTarrasqueActivity.class);
//                Intent assaultCuirassIntent = new Intent(view.getContext(), AssaultCuirassActivity.class);
//                //Weapons
//                Weapons.12345
//                Intent crystalysIntent = new Intent(view.getContext(), CrystalysActivity.class);
//                Intent armletOfMordiggianIntent = new Intent(view.getContext(), ArmletOfMordiggianActivity.class);
//                Intent shadowBladeIntent = new Intent(view.getContext(), ShadowBladeActivity.class);
//                Intent skullBasherIntent = new Intent(view.getContext(), SkullBasherActivity.class);
//                Intent battleFuryIntent = new Intent(view.getContext(), BattleFuryActivity.class);
//                Intent etherealBladeIntent = new Intent(view.getContext(), EtherealBladeActivity.class);
//                Intent radianceIntent = new Intent(view.getContext(), RadianceActivity.class);
//                Intent monkeyKingBarIntent = new Intent(view.getContext(), MonkeyKingBarActivity.class);
//                Intent daedalusIntent = new Intent(view.getContext(), DaedalusActivity.class);
//                Intent butterflyIntent = new Intent(view.getContext(), ButterflyActivity.class);
//                Intent silverEdgeIntent = new Intent(view.getContext(), SilverEdgeActivity.class);
//                Intent divineRapierIntent = new Intent(view.getContext(), DivineRapierActivity.class);
//                Intent abyssalBladeIntent = new Intent(view.getContext(), AbyssalBladeActivity.class);
//                Intent bloodthornIntent = new Intent(view.getContext(), BloodthornActivity.class);
//                //Artifacts
//                Artifacts.12345
//                Intent dragonLanceIntent = new Intent(view.getContext(), DragonLanceActivity.class);
//                Intent sangeIntent = new Intent(view.getContext(), SangeActivity.class);
//                Intent yashaIntent = new Intent(view.getContext(), YashaActivity.class);
//                Intent maskOfMadnessIntent = new Intent(view.getContext(), MaskOfMadnessActivity.class);
//                Intent helmOfTheDominatorIntent = new Intent(view.getContext(), HelmOfTheDominatorActivity.class);
//                Intent echoSabreIntent = new Intent(view.getContext(), EchoSabreActivity.class);
//                Intent maelstormIntent = new Intent(view.getContext(), MaelstormActivity.class);
//                Intent diffusalBladeIntent = new Intent(view.getContext(), DiffusalBladeActivity.class);
//                Intent heavensHalberdIntent = new Intent(view.getContext(), HeavensHalberdActivity.class);
//                Intent desolatorIntent = new Intent(view.getContext(), DesolatorActivity.class);
//                Intent sangeAndYashaIntent = new Intent(view.getContext(), SangeAndYashaActivity.class);
//                Intent mjollnirIntent = new Intent(view.getContext(), MjollnirActivity.class);
//                Intent satanicIntent = new Intent(view.getContext(), SatanicActivity.class);
//                Intent eyeOfSkadiIntent = new Intent(view.getContext(), EyeOfSkadiActivity.class);
//                //Dropped
//                Dropped.12345
//                Intent aegisOfTheImmortalIntent = new Intent(view.getContext(), AegisOfTheImmortalActivity.class);
//                Intent cheeseIntent = new Intent(view.getContext(), CheeseActivity.class);
//
//                if (position == 0)  {
//                    Toast.makeText(getContext(), "Consumables", Toast.LENGTH_SHORT).show();
//                }   else if (position == 1)  {
//                    startActivity(clarityIntent);
//                }   else if (position == 2)  {
//                    startActivity(smokeOfDeceitIntent);
//                }   else if (position == 3) {
//                    startActivity(townPortalScroolIntent);
//                }   else if (position == 4) {
//                    startActivity(observerWardIntent);
//                }   else if (position == 5) {
//                    startActivity(faerieFireIntent);
//                }   else if (position == 6) {
//                    startActivity(animalCourierIntent);
//                }   else if (position == 7) {
//                    startActivity(enchantedMangoIntent);
//                }   else if (position == 8) {
//                    startActivity(sentryWardIntent);
//                }   else if (position == 9) {
//                    startActivity(healingSalveIntent);
//                }   else if (position == 10) {
//                    startActivity(tangoIntent);
//                }   else if (position == 11) {
//                    startActivity(tomeOfKnowledgeIntent);
//                }   else if (position == 12) {
//                    startActivity(dustOfAppearanceIntent);
//                }   else if (position == 13) {
//                    startActivity(flyingCourierIntent);
//                }   else if (position == 14) {
//                    startActivity(bottleIntent);
//
//                }   else if (position == 15) {
//                    Toast.makeText(getContext(), "Attributes", Toast.LENGTH_SHORT).show();
//                }   else if (position == 16) {
//                    startActivity(ironBranchIntent);
//                }   else if (position == 17) {
//                    startActivity(gauntletsOfStrengthIntent);
//                }   else if (position == 18) {
//                    startActivity(mantleOfIntelligenceIntent);
//                }   else if (position == 19) {
//                    startActivity(slippersOfAgilityIntent);
//                }   else if (position == 20) {
//                    startActivity(circletIntent);
//                }   else if (position == 21) {
//                    startActivity(bandOfElvenskinIntent);
//                }   else if (position == 22) {
//                    startActivity(beltOfStrengthIntent);
//                }   else if (position == 23) {
//                    startActivity(robeOfTheMagiIntent);
//                }   else if (position == 24) {
//                    startActivity(bladeOfAlacrityIntent);
//                }   else if (position == 25) {
//                    startActivity(ogreClubIntent);
//                }   else if (position == 26) {
//                    startActivity(staffOfWizardryIntent);
//
//                }   else if (position == 27) {
//                    Toast.makeText(getContext(), "Armaments", Toast.LENGTH_SHORT).show();
//                }   else if (position == 28) {
//                    startActivity(ringOfProtectionIntent);
//                }   else if (position == 29) {
//                    startActivity(quellingBladeIntent);
//                }   else if (position == 30) {
//                    startActivity(stoutShieldIntent);
//                }   else if (position == 31) {
//                    startActivity(infusedRaindropIntent);
//                }   else if (position == 32) {
//                    startActivity(orbOfVenomIntent);
//                }   else if (position == 33) {
//                    startActivity(blightStoneIntent);
//                }   else if (position == 34) {
//                    startActivity(bladesOfAttackIntent);
//                }   else if (position == 35) {
//                    startActivity(chainmailIntent);
//                }   else if (position == 36) {
//                    startActivity(quarterstaffIntent);
//                }   else if (position == 37) {
//                    startActivity(helmOfIronWillIntent);
//                }   else if (position == 38) {
//                    startActivity(broadswordIntent);
//                }   else if (position == 39) {
//                    startActivity(claymoreIntent);
//                }   else if (position == 40) {
//                    startActivity(javelinIntent);
//                }   else if (position == 41) {
//                    startActivity(mithrilHammerIntent);
//
//                }   else if (position == 42) {
//                    Toast.makeText(getContext(), "Arcane", Toast.LENGTH_SHORT).show();
//                }   else if (position == 43) {
//                    startActivity(magicStickIntent);
//                }   else if (position == 44) {
//                    startActivity(windLaceIntent);
//                }   else if (position == 45) {
//                    startActivity(ringOfRegenIntent);
//                }   else if (position == 46) {
//                    startActivity(sageMaskIntent);
//                }   else if (position == 47) {
//                    startActivity(bootsOfSpeedIntent);
//                }   else if (position == 48) {
//                    startActivity(glovesOfHasteIntent);
//                }   else if (position == 49) {
//                    startActivity(cloakIntent);
//                }   else if (position == 50) {
//                    startActivity(rightOfHealthIntent);
//                }   else if (position == 51) {
//                    startActivity(voidStoneIntent);
//                }   else if (position == 52) {
//                    startActivity(gemOfTrueSightIntent);
//                }   else if (position == 53) {
//                    startActivity(morbidMaskIntent);
//                }   else if (position == 54) {
//                    startActivity(shadowAmuletIntent);
//                }   else if (position == 55) {
//                    startActivity(ghostScepterIntent);
//                }   else if (position == 56) {
//                    startActivity(blinkDaggerIntent);
//
//                }   else if (position == 57) {
//                    Toast.makeText(getContext(), "Secret", Toast.LENGTH_SHORT).show();
//                }   else if (position == 58) {
//                    startActivity(energyBoosterIntent);
//                }   else if (position == 59) {
//                    startActivity(vitalityBoosterIntent);
//                }   else if (position == 60) {
//                    startActivity(pointBoosterIntent);
//                }   else if (position == 61) {
//                    startActivity(platemailIntent);
//                }   else if (position == 62) {
//                    startActivity(talismanOfEvasionIntent);
//                }   else if (position == 63) {
//                    startActivity(hyperstoneIntent);
//                }   else if (position == 64) {
//                    startActivity(ultimateOrbIntent);
//                }   else if (position == 65) {
//                    startActivity(demonEdgeIntent);
//                }   else if (position == 66) {
//                    startActivity(mysticStaffIntent);
//                }   else if (position == 67) {
//                    startActivity(reaverIntent);
//                }   else if (position == 68) {
//                    startActivity(eaglesongIntent);
//                }   else if (position == 69) {
//                    startActivity(sacredRelicIntent);
//
//                }   else if (position == 70) {
//                    Toast.makeText(getContext(), "Common", Toast.LENGTH_SHORT).show();
//                }   else if (position == 71) {
//                    startActivity(magicWandIntent);
//                }   else if (position == 72) {
//                    startActivity(nullTalismanIntent);
//                }   else if (position == 73) {
//                    startActivity(wraithBandIntent);
//                }   else if (position == 74) {
//                    startActivity(bracerIntent);
//                }   else if (position == 75) {
//                    startActivity(poorMansShieldIntent);
//                }   else if (position == 76) {
//                    startActivity(soulRingIntent);
//                }   else if (position == 77) {
//                    startActivity(phaseBootsIntent);
//                }   else if (position == 78) {
//                    startActivity(powerTreadsIntent);
//                }   else if (position == 79) {
//                    startActivity(oblivionStaffIntent);
//                }   else if (position == 80) {
//                    startActivity(perseveranceIntent);
//                }   else if (position == 81) {
//                    startActivity(handOfMidasIntent);
//                }   else if (position == 82) {
//                    startActivity(bootsOfTravelIntent);
//                }   else if (position == 83) {
//                    startActivity(moonShardIntent);
//
//                }   else if (position == 84) {
//                    Toast.makeText(getContext(), "Support", Toast.LENGTH_SHORT).show();
//                }   else if (position == 85) {
//                    startActivity(ironTalonIntent);
//                }   else if (position == 86) {
//                    startActivity(ringOfBasiliusIntent);
//                }   else if (position == 87) {
//                    startActivity(headdressIntent);
//                }   else if (position == 88) {
//                    startActivity(bucklerIntent);
//                }   else if (position == 89) {
//                    startActivity(urnOfShadowsIntent);
//                }   else if (position == 90) {
//                    startActivity(tranquilBootsIntent);
//                }   else if (position == 91) {
//                    startActivity(ringOfAquilaIntent);
//                }   else if (position == 92) {
//                    startActivity(medallionOfCourageIntent);
//                }   else if (position == 93) {
//                    startActivity(arcaneBootsIntent);
//                }   else if (position == 94) {
//                    startActivity(drumOfEnduranceIntent);
//                }   else if (position == 95) {
//                    startActivity(vladmirsOfferingIntent);
//                }   else if (position == 96) {
//                    startActivity(mekansmIntent);
//                }   else if (position == 97) {
//                    startActivity(pipeOfInsightIntent);
//                }   else if (position == 98) {
//                    startActivity(guardianGreavesIntent);
//
//                }   else if (position == 99) {
//                    Toast.makeText(getContext(), "Caster", Toast.LENGTH_SHORT).show();
//                }   else if (position == 100) {
//                    startActivity(glimmerCapeIntent);
//                }   else if (position == 101) {
//                    startActivity(forceStaffIntent);
//                }   else if (position == 102) {
//                    startActivity(veilOfDiscordIntent);
//                }   else if (position == 103) {
//                    startActivity(aetherLensIntent);
//                }   else if (position == 104) {
//                    startActivity(solarCrestIntent);
//                }   else if (position == 105) {
//                    startActivity(necronomiconIntent);
//                }   else if (position == 106) {
//                    startActivity(dagonIntent);
//                }   else if (position == 107) {
//                    startActivity(eulsScepterOfDivinityIntent);
//                }   else if (position == 108) {
//                    startActivity(rodOfAtosIntent);
//                }   else if (position == 109) {
//                    startActivity(orchidMalevolenceIntent);
//                }   else if (position == 110) {
//                    startActivity(aghanimsScepterIntent);
//                }   else if (position == 111) {
//                    startActivity(refresherOrbIntent);
//                }   else if (position == 112) {
//                    startActivity(scytheOfVyseIntent);
//                }   else if (position == 113) {
//                    startActivity(octarineCoreIntent);
//
//                }   else if (position == 114) {
//                    Toast.makeText(getContext(), "Armor", Toast.LENGTH_SHORT).show();
//                }   else if (position == 115) {
//                    startActivity(hoodOfDefianceIntent);
//                }   else if (position == 116) {
//                    startActivity(vanguardIntent);
//                }   else if (position == 117) {
//                    startActivity(bladeMailIntent);
//                }   else if (position == 118) {
//                    startActivity(soulBoosterIntent);
//                }   else if (position == 119) {
//                    startActivity(crimsonGuardIntent);
//                }   else if (position == 120) {
//                    startActivity(blackKingBarIntent);
//                }   else if (position == 121) {
//                    startActivity(lotusOrbIntent);
//                }   else if (position == 122) {
//                    startActivity(hurricanePikeIntent);
//                }   else if (position == 123) {
//                    startActivity(shivasGuardIntent);
//                }   else if (position == 124) {
//                    startActivity(bloodstoneIntent);
//                }   else if (position == 125) {
//                    startActivity(linkensSphereIntent);
//                }   else if (position == 126) {
//                    startActivity(mantaStyleIntent);
//                }   else if (position == 127) {
//                    startActivity(heartOfTarrasqueIntent);
//                }   else if (position == 128) {
//                    startActivity(assaultCuirassIntent);
//
//                }   else if (position == 129) {
//                    Toast.makeText(getContext(), "Weapons", Toast.LENGTH_SHORT).show();
//                }   else if (position == 130) {
//                    startActivity(crystalysIntent);
//                }   else if (position == 131) {
//                    startActivity(armletOfMordiggianIntent);
//                }   else if (position == 132) {
//                    startActivity(shadowBladeIntent);
//                }   else if (position == 133) {
//                    startActivity(skullBasherIntent);
//                }   else if (position == 134) {
//                    startActivity(battleFuryIntent);
//                }   else if (position == 135) {
//                    startActivity(etherealBladeIntent);
//                }   else if (position == 136) {
//                    startActivity(radianceIntent);
//                }   else if (position == 137) {
//                    startActivity(monkeyKingBarIntent);
//                }   else if (position == 138) {
//                    startActivity(daedalusIntent);
//                }   else if (position == 139) {
//                    startActivity(butterflyIntent);
//                }   else if (position == 140) {
//                    startActivity(silverEdgeIntent);
//                }   else if (position == 141) {
//                    startActivity(divineRapierIntent);
//                }   else if (position == 142) {
//                    startActivity(abyssalBladeIntent);
//                }   else if (position == 143) {
//                    startActivity(bloodthornIntent);
//
//                }   else if (position == 144) {
//                    Toast.makeText(getContext(), "Artifacts", Toast.LENGTH_SHORT).show();
//                }   else if (position == 145) {
//                    startActivity(dragonLanceIntent);
//                }   else if (position == 146) {
//                    startActivity(sangeIntent);
//                }   else if (position == 147) {
//                    startActivity(yashaIntent);
//                }   else if (position == 148) {
//                    startActivity(maskOfMadnessIntent);
//                }   else if (position == 149) {
//                    startActivity(helmOfTheDominatorIntent);
//                }   else if (position == 150) {
//                    startActivity(echoSabreIntent);
//                }   else if (position == 151) {
//                    startActivity(maelstormIntent);
//                }   else if (position == 152) {
//                    startActivity(diffusalBladeIntent);
//                }   else if (position == 153) {
//                    startActivity(heavensHalberdIntent);
//                }   else if (position == 154) {
//                    startActivity(desolatorIntent);
//                }   else if (position == 155) {
//                    startActivity(sangeAndYashaIntent);
//                }   else if (position == 156) {
//                    startActivity(mjollnirIntent);
//                }   else if (position == 157) {
//                    startActivity(satanicIntent);
//                }   else if (position == 158) {
//                    startActivity(eyeOfSkadiIntent);
//
//                }   else if (position == 159) {
//                    Toast.makeText(getContext(), "Dropped", Toast.LENGTH_SHORT).show();
//                }   else if (position == 160) {
//                    startActivity(aegisOfTheImmortalIntent);
//                }   else if (position == 161) {
//                    startActivity(cheeseIntent);
//                }   else {
//                    Log.e("ItemsFragment", "position: " + position);
//                }
            }
        });

        return rootView;
    }
}
