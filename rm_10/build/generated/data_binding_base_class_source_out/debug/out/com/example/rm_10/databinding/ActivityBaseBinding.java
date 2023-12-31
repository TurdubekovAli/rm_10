// Generated by view binder compiler. Do not edit!
package com.example.rm_10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.rm_10.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityBaseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout placeHolder;

  private ActivityBaseBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout placeHolder) {
    this.rootView = rootView;
    this.placeHolder = placeHolder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_base, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBaseBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout placeHolder = (ConstraintLayout) rootView;

    return new ActivityBaseBinding((ConstraintLayout) rootView, placeHolder);
  }
}
