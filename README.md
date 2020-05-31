# Spring Back Layout
**A wrapper ViewGroup that provides an iOS Look-And-Feel Overscroll Effect**
### Note
This is the layout that's used in MIUI Setting App.

### Screen shot

<div align="center">
  <table align="center" border="0" >
  <tr>
    <td> <img width="360"
src="https://user-images.githubusercontent.com/33343210/82741450-1ca06280-9d7c-11ea-9986-ad2a83673e23.gif"/></td>
  </tr>
</table>
  </div>
</br>

### Adding to project
```
implementation 'com.github.ldt-libs:SpringBackLayout:1.0'
```

### Usage
Wrap any scrollable view in the SpringBackLayout, like RecyclerView, ListView or NestedScrollView.

```
<com.ldt.springback.view.SpringBackLayout
    android:id="@+id/root"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:scrollOrientation="vertical"
    tools:context=".MainActivity">
    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recycler_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
</com.ldt.springback.view.SpringBackLayout>
```
