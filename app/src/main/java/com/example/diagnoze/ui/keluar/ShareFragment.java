package com.example.diagnoze.ui.keluar;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.diagnoze.R;

public class ShareFragment extends Fragment {

    private ShareViewModel shareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        getActivity().finish();
        shareViewModel =
                ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_keluar, container, false);
        final TextView textView = root.findViewById(R.id.text_share);
        shareViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }

//    private void showDialog() throws Resources.NotFoundException{
//        new AlertDialog.Builder(this)
//                .setTitle()
//
//    }

//    private void showDialog() throws NotFoundException {
//        new AlertDialog.Builder(this)
//                .setTitle(getResources().getString(R.string.ClearCookies))
//                .setMessage(
//                        getResources().getString(R.string.ClearCookieQuestion))
//                .setIcon(
//                        getResources().getDrawable(
//                                android.R.drawable.ic_dialog_alert))
//                .setPositiveButton(
//                        getResources().getString(R.string.PostiveYesButton),
//                        new DialogInterface.OnClickListener() {
//
//                            @Override
//                            public void onClick(DialogInterface dialog,
//                                                int which) {
//                                //Do Something Here
//
//                            }
//                        })
//                .setNegativeButton(
//                        getResources().getString(R.string.NegativeNoButton),
//                        new DialogInterface.OnClickListener() {
//
//                            @Override
//                            public void onClick(DialogInterface dialog,
//                                                int which) {
//                                //Do Something Here
//                            }
//                        }).show();
//    }

}