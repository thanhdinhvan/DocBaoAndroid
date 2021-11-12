package com.example.docbaoapp.view.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.docbaoapp.R;
import com.example.docbaoapp.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    ListView lv_SachMoi, lv_SachCoYeuThich;
    List<String> bookNews, bookLikes;

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        bookLikes = new ArrayList<>();
        bookLikes = new ArrayList<>();
        lv_SachMoi = view.findViewById(R.id.lv_SachMoi);
        lv_SachCoYeuThich = view.findViewById(R.id.lv_cothebanthich);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}