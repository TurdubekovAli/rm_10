// Generated by view binder compiler. Do not edit!
package com.example.rm_10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rm_10.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final ImageButton imageBluetoothOn;

  @NonNull
  public final ImageButton imageBluetoothSearch;

  @NonNull
  public final ProgressBar pbSearch;

  @NonNull
  public final RecyclerView rcViewPaired;

  @NonNull
  public final RecyclerView rcViewSearch;

  @NonNull
  public final TextView tvEmptyPaired;

  @NonNull
  public final TextView tvEmptySearch;

  @NonNull
  public final TextView tvPaired;

  @NonNull
  public final TextView tvSearch;

  private FragmentListBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull CardView cardView2, @NonNull Guideline guideline,
      @NonNull ImageButton imageBluetoothOn, @NonNull ImageButton imageBluetoothSearch,
      @NonNull ProgressBar pbSearch, @NonNull RecyclerView rcViewPaired,
      @NonNull RecyclerView rcViewSearch, @NonNull TextView tvEmptyPaired,
      @NonNull TextView tvEmptySearch, @NonNull TextView tvPaired, @NonNull TextView tvSearch) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.cardView2 = cardView2;
    this.guideline = guideline;
    this.imageBluetoothOn = imageBluetoothOn;
    this.imageBluetoothSearch = imageBluetoothSearch;
    this.pbSearch = pbSearch;
    this.rcViewPaired = rcViewPaired;
    this.rcViewSearch = rcViewSearch;
    this.tvEmptyPaired = tvEmptyPaired;
    this.tvEmptySearch = tvEmptySearch;
    this.tvPaired = tvPaired;
    this.tvSearch = tvSearch;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.imageBluetoothOn;
      ImageButton imageBluetoothOn = ViewBindings.findChildViewById(rootView, id);
      if (imageBluetoothOn == null) {
        break missingId;
      }

      id = R.id.imageBluetoothSearch;
      ImageButton imageBluetoothSearch = ViewBindings.findChildViewById(rootView, id);
      if (imageBluetoothSearch == null) {
        break missingId;
      }

      id = R.id.pbSearch;
      ProgressBar pbSearch = ViewBindings.findChildViewById(rootView, id);
      if (pbSearch == null) {
        break missingId;
      }

      id = R.id.rcViewPaired;
      RecyclerView rcViewPaired = ViewBindings.findChildViewById(rootView, id);
      if (rcViewPaired == null) {
        break missingId;
      }

      id = R.id.rcViewSearch;
      RecyclerView rcViewSearch = ViewBindings.findChildViewById(rootView, id);
      if (rcViewSearch == null) {
        break missingId;
      }

      id = R.id.tvEmptyPaired;
      TextView tvEmptyPaired = ViewBindings.findChildViewById(rootView, id);
      if (tvEmptyPaired == null) {
        break missingId;
      }

      id = R.id.tvEmptySearch;
      TextView tvEmptySearch = ViewBindings.findChildViewById(rootView, id);
      if (tvEmptySearch == null) {
        break missingId;
      }

      id = R.id.tvPaired;
      TextView tvPaired = ViewBindings.findChildViewById(rootView, id);
      if (tvPaired == null) {
        break missingId;
      }

      id = R.id.tvSearch;
      TextView tvSearch = ViewBindings.findChildViewById(rootView, id);
      if (tvSearch == null) {
        break missingId;
      }

      return new FragmentListBinding((ConstraintLayout) rootView, cardView, cardView2, guideline,
          imageBluetoothOn, imageBluetoothSearch, pbSearch, rcViewPaired, rcViewSearch,
          tvEmptyPaired, tvEmptySearch, tvPaired, tvSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
