package com.example.docbaoapp.view.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.docbaoapp.R;
import com.example.docbaoapp.databinding.FragmentHomeBinding;
import com.example.docbaoapp.databinding.FragmentSettingBinding;
import com.example.docbaoapp.databinding.FragmentTuSachFaragmentBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TuSachFaragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TuSachFaragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentTuSachFaragmentBinding binding;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TuSachFaragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TuSachFaragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TuSachFaragment newInstance(String param1, String param2) {
        TuSachFaragment fragment = new TuSachFaragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTuSachFaragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}