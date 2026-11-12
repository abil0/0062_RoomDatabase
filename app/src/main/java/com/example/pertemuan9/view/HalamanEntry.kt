package com.example.pertemuan9.view

import androidx.compose.material.icons.R
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.example.pertemuan9.uicontroller.DestinasiNavigasi


object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(
    detailSiswa: DetailSiswa,
    modifier: Modifier = Modifier,
    onValueChange: (DetailSiswa) -> Unit = {},
    enabled: Boolean = true
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_medium))
    ){
        OutlinedTextField(
            value = detailSiswa.nama,
            onValueChange = {onValueChange(detailSiswa.copy(nama=it)) },
            label = { Text(stringResource(R.string.nama)) },
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true
        )
        OutlinedTextField(
            value = detailSiswa.alamat,
            onValueChange = {onValueChange(detailSiswa.copy(alamat=it))},
            label = { Text(stringResource(R.string.alamat)) },
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            singleLine = true
        )
    }
}