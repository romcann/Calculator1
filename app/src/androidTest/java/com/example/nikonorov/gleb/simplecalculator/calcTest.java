package com.example.nikonorov.gleb.simplecalculator;


import static android.support.test.espresso.Espresso.onView;
import android.support.test.espresso.ViewAction;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class calcTest {

    //Launch the application

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOne(){
        //Add 2+2 = 4
        //Espresso - is a class 
        //ViewMatchers - is a class 
        //ViewActions - is a class 
        //ViewAssertions - is a class

//        Espresso.onView(ViewMatchers.withId(R.id.twoButton)).perform(ViewActions.click());
//        Espresso.onView(ViewMatchers.withId(R.id.adButton)).perform(ViewActions.click());
//        Espresso.onView(ViewMatchers.withId(R.id.twoButton)).perform(ViewActions.click());
//        Espresso.onView(ViewMatchers.withId(R.id.equalsButton)).perform(ViewActions.click());

        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.adButton)).perform(click());
        onView(withId(R.id.twoButton)).perform(click());
        onView(withId(R.id.equalsButton)).perform(click());

        //Result is Four
//        Espresso.onView(ViewMatchers.withId(R.id.outputLabel)).check(ViewAssertions.matches(ViewMatchers.withText("4")));
        onView(withId(R.id.outputLabel)).check(matches(withText("4")));
    }


    @Test
    public void testTwo(){
        //11 - 9

        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.oneButton)).perform(click());
        onView(withId(R.id.subtractButton)).perform(click());
        onView(withId(R.id.nineButton)).perform(click());
        onView(withId(R.id.equalsButton)).perform(click());

        onView(withId(R.id.outputLabel)).check(matches(withText("2")));

    }


}
