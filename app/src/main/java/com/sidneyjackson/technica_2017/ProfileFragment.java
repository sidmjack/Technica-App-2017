package com.sidneyjackson.technica_2017;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ProfileFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private View rootView;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        getActivity().setTitle(R.string.profile_title);

        EditText firstName = (EditText) rootView.findViewById(R.id.fName_ID);
        EditText lastName = (EditText) rootView.findViewById(R.id.lName_ID);
        EditText middleInitial = (EditText) rootView.findViewById(R.id.mName_ID);

        EditText email = (EditText) rootView.findViewById(R.id.email_ID);
        EditText linkedIn = (EditText) rootView.findViewById(R.id.linkedInID);

        EditText school = (EditText) rootView.findViewById(R.id.school_ID);
        EditText discipline = (EditText) rootView.findViewById(R.id.disciplineID);
        EditText degree = (EditText) rootView.findViewById(R.id.degreeID);
        EditText eduYear = (EditText) rootView.findViewById(R.id.eduYearID);

        EditText businessName = (EditText) rootView.findViewById(R.id.businessNameID);
        EditText businessArea = (EditText) rootView.findViewById(R.id.businessAreaID);

        firstName.setText("Leshon");
        lastName.setText("Kimble-Brown");
        middleInitial.setText("D");
        email.setText("le@shon.com");
        linkedIn.setText("www.linkedin.com/leshon-kimble-brown");
        school.setText("University of Illinois at Chicago");
        discipline.setText("Urban Planning");
        degree.setText("Masters");
        eduYear.setText("1993");
        businessName.setText("Urban Planners for Social Change");
        businessArea.setText("DC Metro Area");

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle(R.string.profile_title);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
