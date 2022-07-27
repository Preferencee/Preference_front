package com.example.preference.ui.mypage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.preference.databinding.FragmentMypageBinding;

public class MypageFragment extends Fragment {

    private FragmentMypageBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MypageViewModel MypageViewModel =
                new ViewModelProvider(this).get(MypageViewModel.class);

        binding = FragmentMypageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView;
        textView = binding.textMypage;
        MypageViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}