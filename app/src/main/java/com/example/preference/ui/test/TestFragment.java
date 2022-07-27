package com.example.preference.ui.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.preference.databinding.FragmentTestBinding;
import com.example.preference.databinding.FragmentTestBinding;

public class TestFragment extends Fragment {

    private FragmentTestBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TestViewModel TestViewModel =
                new ViewModelProvider(this).get(TestViewModel.class);

        binding = FragmentTestBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTest;
        TestViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}