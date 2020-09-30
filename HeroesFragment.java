package com.example.android.dota2info;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class HeroesFragment extends Fragment {

    public HeroesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)   {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Abaddon", "Strength", R.drawable.abaddon));
        words.add(new Word("Alchemist", "Strength", R.drawable.alchemist));
        words.add(new Word("Ancient Apparition", "Intelligence", R.drawable.ancient_apparition));
        words.add(new Word("Anti-Mage", "Agility", R.drawable.antimage));
        words.add(new Word("Arc Warden", "Agility", R.drawable.arc_warden));
        words.add(new Word("Axe", "Strength", R.drawable.axe));
        words.add(new Word("Bane", "Intelligence", R.drawable.bane));
        words.add(new Word("Batrider", "Strength", R.drawable.batrider));
        words.add(new Word("Beastmaster", "Strength", R.drawable.beastmaster));
        words.add(new Word("Bloodseeker", "Agility", R.drawable.bloodseeker));
        words.add(new Word("Bounty Hunter", "Agility", R.drawable.bounty_hunter));
        words.add(new Word("Brewmaster", "Strength", R.drawable.brewmaster));
        words.add(new Word("Bristleback", "Strength", R.drawable.bristleback));
        words.add(new Word("Broodmother", "Agility", R.drawable.broodmother));
        words.add(new Word("Centaur Warrunner", "Strength", R.drawable.centaur_warrunner));
        words.add(new Word("Chaos Knight", "Strength", R.drawable.chaos_knight));
        words.add(new Word("Chen", "Intelligence", R.drawable.chen));
        words.add(new Word("Clinkz", "Agility", R.drawable.clinkz));
        words.add(new Word("Clockwerk", "Strength", R.drawable.clockwerk));
        words.add(new Word("Crystal Maiden", "Intelligence", R.drawable.crystal_maiden));
        words.add(new Word("Dark Seer", "Strength", R.drawable.dark_seer));
        words.add(new Word("Dazzle", "Intelligence", R.drawable.dazzle));
        words.add(new Word("Death Prophet", "Intelligence", R.drawable.death_prophet));
        words.add(new Word("Disruptor", "Intelligence", R.drawable.disruptor));
        words.add(new Word("Doom", "Strength", R.drawable.doom));
        words.add(new Word("Dragon Knight", "Strength", R.drawable.dragon_knight));
        words.add(new Word("Drow Ranger", "Agility", R.drawable.drow_ranger));
        words.add(new Word("Earth Spirit", "Strength", R.drawable.earth_spirit));
        words.add(new Word("Earthshaker", "Strength", R.drawable.earthshaker));
        words.add(new Word("Elder Titan", "Strength", R.drawable.elder_titan));
        words.add(new Word("Ember Spirit", "Strength", R.drawable.ember_spirit));
        words.add(new Word("Enchantress", "Intelligence", R.drawable.enchantress));
        words.add(new Word("Enigma", "Intelligence", R.drawable.enigma));
        words.add(new Word("Faceless Void", "Agility", R.drawable.faceless_void));
        words.add(new Word("Gyrocopter", "Agility", R.drawable.gyrocopter));
        words.add(new Word("Huskar", "Strength", R.drawable.huskar));
        words.add(new Word("Invoker", "Intelligence", R.drawable.invoker));
        words.add(new Word("Io", "Strength", R.drawable.io));
        words.add(new Word("Jakiro", "Intelligence", R.drawable.jakiro));
        words.add(new Word("Juggernaut", "Agility", R.drawable.juggernaut));
        words.add(new Word("Keeper of the Light", "Intelligence", R.drawable.keeper_of_the_light));
        words.add(new Word("Kunkka", "Strength", R.drawable.kunkka));
        words.add(new Word("Legion Commander", "Strength", R.drawable.legion_commander));
        words.add(new Word("Leshrac", "Intelligence", R.drawable.leshrac));
        words.add(new Word("Lich", "Intelligence", R.drawable.lich));
        words.add(new Word("Lifestealer", "Strength", R.drawable.lifestealer));
        words.add(new Word("Lina", "Intelligence", R.drawable.lina));
        words.add(new Word("Lion", "Intelligence", R.drawable.lion));
        words.add(new Word("Lone Druid", "Agility", R.drawable.lone_druid));
        words.add(new Word("Luna", "Agility", R.drawable.luna));
        words.add(new Word("Lycan", "Strength", R.drawable.lycan));
        words.add(new Word("Manus", "Strength", R.drawable.magnus));
        words.add(new Word("Medusa", "Agility", R.drawable.medusa));
        words.add(new Word("Meepo", "Agility", R.drawable.meepo));
        words.add(new Word("Mirana", "Agility", R.drawable.mirana));
        words.add(new Word("Monkey King", "Agility", R.drawable.monkey_king));
        words.add(new Word("Morphling", "Agility", R.drawable.morphling));
        words.add(new Word("Naga Siren", "Agility", R.drawable.naga_siren));
        words.add(new Word("Nature's Prophet", "Intelligence", R.drawable.natures_prophet));
        words.add(new Word("Necrophos", "Intelligence", R.drawable.necrophos));
        words.add(new Word("Night Stalker", "Strength", R.drawable.night_stalker));
        words.add(new Word("Nyx Assassin", "Agility", R.drawable.nyx_assassin));
        words.add(new Word("Ogre Magi", "Intelligence", R.drawable.ogre_magi));
        words.add(new Word("Omnikight", "Strength", R.drawable.omniknight));
        words.add(new Word("Oracle", "Intelligence", R.drawable.oracle));
        words.add(new Word("Outworld Devourer", "Intelligence", R.drawable.outworld_devourer));
        words.add(new Word("Phantom Assassin", "Agility", R.drawable.phantom_assassin));
        words.add(new Word("Phantom Lancer", "Agility", R.drawable.phantom_lancer));
        words.add(new Word("Phoenix", "Strength", R.drawable.phoenix));
        words.add(new Word("Puck", "Intelligence", R.drawable.puck));
        words.add(new Word("Pudge", "Strength", R.drawable.pudge));
        words.add(new Word("Pugna", "Intelligence", R.drawable.pugna));
        words.add(new Word("Queen of Pain", "Intelligence", R.drawable.queen_of_pain));
        words.add(new Word("Razor", "Agility", R.drawable.razor));
        words.add(new Word("Riki", "Strength", R.drawable.riki));
        words.add(new Word("Rubick", "Intelligence", R.drawable.rubick));
        words.add(new Word("Sand King", "Strength", R.drawable.sand_king));
        words.add(new Word("Shadow Demon", "Intelligence", R.drawable.shadow_demon));
        words.add(new Word("Shadow Fiend", "Agility", R.drawable.shadow_fiend));
        words.add(new Word("Shadow Shamen", "Intelligence", R.drawable.shadow_shaman));
        words.add(new Word("Silancer", "Intelligence", R.drawable.silencer));
        words.add(new Word("Skywrath Mage", "Intelligence", R.drawable.skywrath_mage));
        words.add(new Word("Slardar", "Strength", R.drawable.slardar));
        words.add(new Word("Slark", "Agility", R.drawable.slark));
        words.add(new Word("Sniper", "Agility", R.drawable.sniper));
        words.add(new Word("Spectre", "Agility", R.drawable.spectre));
        words.add(new Word("Spirit Breaker", "Strength", R.drawable.spirit_breaker));
        words.add(new Word("Storm Spirit", "Intelligence", R.drawable.storm_spirit));
        words.add(new Word("Sven", "Strength", R.drawable.sven));
        words.add(new Word("Techies", "Intelligence", R.drawable.techies));
        words.add(new Word("Templar Assassin", "Agility", R.drawable.templar_assassin));
        words.add(new Word("Terrorblade", "Agility", R.drawable.terrorblade));
        words.add(new Word("Tidehunter", "Strength", R.drawable.tidehunter));
        words.add(new Word("Timbersaw", "Strength", R.drawable.timbersaw));
        words.add(new Word("Tinker", "Intelligence", R.drawable.tinker));
        words.add(new Word("Tiny", "Strength", R.drawable.tiny));
        words.add(new Word("Viper", "Strength", R.drawable.viper));
        words.add(new Word("Visage", "Intelligence", R.drawable.visage));
        words.add(new Word("Warlock", "Intelligence", R.drawable.warlock));
        words.add(new Word("Weaver", "Agility", R.drawable.weaver));
        words.add(new Word("Windranger", "Intelligence", R.drawable.windranger));
        words.add(new Word("Winter Wyvern", "Intelligence", R.drawable.winter_wyvern));
        words.add(new Word("Witch Doctor", "Intelligence", R.drawable.witch_doctor));
        words.add(new Word("Wraith King", "Strength", R.drawable.wraith_king));
        words.add(new Word("Zeus", "Intelligence", R.drawable.zeus));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("HeroesFragments", "Position: " + position);
            }
        });


        return rootView;
    }
}
