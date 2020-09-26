package com.example.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EditorFragment extends Fragment {
    public static final String KEY = "key";
    public static EditorFragment newInstance(int position)
    {
        EditorFragment fragment = new EditorFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY,position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.editor_fragment,container,false);
        EditText editText = v.findViewById(R.id.editor);
        int position = getArguments().getInt(KEY, -1);
        editText.setHint(String.valueOf(position+1));
        return v;
    }
    public static CharSequence getTitle(int position)
    {
        return "This is title number "+String.valueOf(position);
    }
}
