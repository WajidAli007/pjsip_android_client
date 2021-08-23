// Generated by view binder compiler. Do not edit!
package com.example.sipdemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.sipdemo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAddAccount;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText etDisplayName;

  @NonNull
  public final EditText etDomain;

  @NonNull
  public final EditText etPortNumber;

  @NonNull
  public final EditText etUserName;

  @NonNull
  public final Spinner spinnerTransport;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnAddAccount,
      @NonNull EditText editTextTextPassword, @NonNull EditText etDisplayName,
      @NonNull EditText etDomain, @NonNull EditText etPortNumber, @NonNull EditText etUserName,
      @NonNull Spinner spinnerTransport) {
    this.rootView = rootView;
    this.btnAddAccount = btnAddAccount;
    this.editTextTextPassword = editTextTextPassword;
    this.etDisplayName = etDisplayName;
    this.etDomain = etDomain;
    this.etPortNumber = etPortNumber;
    this.etUserName = etUserName;
    this.spinnerTransport = spinnerTransport;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAddAccount;
      Button btnAddAccount = rootView.findViewById(id);
      if (btnAddAccount == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = rootView.findViewById(id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.etDisplayName;
      EditText etDisplayName = rootView.findViewById(id);
      if (etDisplayName == null) {
        break missingId;
      }

      id = R.id.etDomain;
      EditText etDomain = rootView.findViewById(id);
      if (etDomain == null) {
        break missingId;
      }

      id = R.id.etPortNumber;
      EditText etPortNumber = rootView.findViewById(id);
      if (etPortNumber == null) {
        break missingId;
      }

      id = R.id.etUserName;
      EditText etUserName = rootView.findViewById(id);
      if (etUserName == null) {
        break missingId;
      }

      id = R.id.spinnerTransport;
      Spinner spinnerTransport = rootView.findViewById(id);
      if (spinnerTransport == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnAddAccount,
          editTextTextPassword, etDisplayName, etDomain, etPortNumber, etUserName,
          spinnerTransport);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
