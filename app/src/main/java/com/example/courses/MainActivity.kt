package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.data.DataSource
import com.example.courses.model.Data
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseData()
                }
            }
        }
    }
}

@Composable
fun CourseData() {
    DataList(list = DataSource().loandDatas())
}

@Composable
fun CourseCard(course: Data, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .padding(8.dp)
    ) {
        Row() {
            Box {
                Image(
                    painter = painterResource(course.imageCourses),
                    contentDescription = null,
                    modifier = modifier
                        .size(width = 68.dp, height = 68.dp)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
            }
            Column {
                Text(
                    text = stringResource(id = course.stringCourses),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier=Modifier
                        .padding(
                            start = dimensionResource(id = R.dimen.padding_small),
                            top = dimensionResource(id = R.dimen.padding_mediun),
                            end = dimensionResource(id = R.dimen.padding_mediun),
                            bottom = dimensionResource(id = R.dimen.padding_small),
                        )
                )
                Row {
                    Icon(painter = painterResource(id = R.drawable.raw_githubusercontent_com_android_compose_samples_main_owl_app_src_main_res_drawable_ic_grain),
                        contentDescription = null,
                    modifier=Modifier.padding(start = dimensionResource(id = R.dimen.padding_mediun))
                    )
                    Text(
                        text = stringResource(id = course.stringNumber),
                        Modifier.padding(
                            start = dimensionResource(id = R.dimen.padding_small),
                        )
                    )
                }
            }
        }
    }
}


@Composable
fun DataList(list:List<Data>,modifier: Modifier = Modifier) {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
       items(list){list->
           CourseCard(course = list)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoursesTheme {
        CourseCard(Data(R.drawable.architecture, R.string.architecture, R.string.architecture1))
    }
}