package com.daletupling.recipeme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ListDetails extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.recipe_details);

		TextView recipeTextView = (TextView) findViewById(R.id.recipeName);
		TextView detailsTextView = (TextView) findViewById(R.id.ingredients);
		TextView ingredientTextV = (TextView) findViewById(R.id.iTitle);

		Intent i = getIntent();
		// getting attached intent data
		String recipe = i.getStringExtra("selectedRecipe");
		String rIngredients = i.getStringExtra("ingredients").replace("[", "")
				.replace("\"", "").replace(",", "\n").replace("]", "\n");

		
		// displaying selected product name
		recipeTextView.setText(recipe);
		ingredientTextV.setText(R.string.ingredientsSt);
		detailsTextView.setText(rIngredients);

	}
}